package me.devnatan.sonyflake

public const val BIT_SEQ: Int = 8
public const val BIT_TIME: Int = 39
public const val BIT_MACHINE_ID: Int = 63 - BIT_TIME - BIT_SEQ
public const val GEN_MASK_SEQ: Long = (1L shl BIT_SEQ) - 1
public const val DEC_MASK_SEQ: Long = ((1L shl BIT_SEQ) - 1) shl BIT_MACHINE_ID
public const val MASK_MACHINE_ID: Long = (1L shl BIT_MACHINE_ID) - 1
public const val TIME_UNIT: Long = 10_000_000 // in nanos



