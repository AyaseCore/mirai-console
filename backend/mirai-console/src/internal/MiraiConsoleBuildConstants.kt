/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.internal

import net.mamoe.mirai.console.util.SemVersion
import java.time.Instant

internal object MiraiConsoleBuildConstants { // auto-filled on build (task :mirai-console:fillBuildConstants)
    @JvmStatic
    val buildDate: Instant = Instant.ofEpochSecond(1610704964)
    const val versionConst: String = "2.0.0"

    @JvmStatic
    val version: SemVersion = SemVersion(versionConst)
}
