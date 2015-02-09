SRC_URI[dm7080.md5sum] = "5d43a74959dcb1c750648f1d2691ee6f"
SRC_URI[dm7080.sha256sum] = "7c4eba49e89166b18a7896e77402de54b7034c5d6e109728b9a4671a2eb4c902"

require enigma2-bin-4.2.inc

SRC_URI += " \
	file://0001-set-priority-of-our-kernel-demux-threads-on-e2-start.patch \
	file://0002-config.py-fixed-possible-crash.patch \
	file://0003-CecRemoteHandler-use-correct-target-for-volume-keys.patch \
"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
