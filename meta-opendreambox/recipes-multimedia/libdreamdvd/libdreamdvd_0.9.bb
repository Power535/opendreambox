SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "${@opendreambox_srcrev('23036c43a97b517bb4785746c382aae99b02217f',d)}"

inherit autotools opendreambox-git pkgconfig
