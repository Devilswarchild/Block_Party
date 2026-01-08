package net.devilswarchild.blockparty.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class JukeBoxUpdateOnTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "musicPlaying") == true) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("musicTimeSeconds", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 242 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord1") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 168 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord2") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 172 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord3") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 179 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord4") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 89 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord5") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 214 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord6") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 188 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord7") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 174 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord8") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 308 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord9") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 219 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord10") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 182 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord11") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 177 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord12") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 161 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord13") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 373 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord14") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 172 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord15") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 191 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord16") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 187 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord17") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 285 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord18") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 197 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord19") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 270 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord20") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 135 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord21") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 192 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord22") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 224 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord23") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 183 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord24") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 194 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord25") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 210 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord26") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 334 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord27") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 189 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord28") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 283 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord29") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "musicTimeSeconds") >= 193 && getBlockNBTLogic(world, BlockPos.containing(x, y, z), "hasRecord30") == true) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("musicPlaying", false);
						_blockEntity.getPersistentData().putDouble("musicTimeSeconds", 0);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDouble(tag);
		return -1;
	}
}