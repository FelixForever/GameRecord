package com.felix.lib.game.main

import com.felix.lib.bean.GameMap
import com.felix.lib.game.fromJson
import com.felix.lib.game.toJson

class GameMapTools {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            "[{\"id\":1,\"name\":\"城镇高速公路\",\"score\":144.15},{\"id\":2,\"name\":\"城镇南山\",\"score\":141.05},{\"id\":3,\"name\":\"滨海风景\",\"score\":156.91},{\"id\":3,\"name\":\"龙之都市\",\"score\":131.54},{\"id\":3,\"name\":\"东方明珠之夜\",\"score\":134.3},{\"id\":4,\"name\":\"狮城狂飙\",\"score\":207.2},{\"id\":5,\"name\":\"惊险飞机场\",\"score\":231.94},{\"id\":6,\"name\":\"日光城\",\"score\":154.27},{\"id\":7,\"name\":\"龙之宫殿\",\"score\":129.23},{\"id\":7,\"name\":\"龙之运河\",\"score\":213.5},{\"id\":8,\"name\":\"龙之西湖\",\"score\":159.82},{\"id\":8,\"name\":\"灵岩环道\",\"score\":152.73},{\"id\":9,\"name\":\"迪拜富人区\",\"score\":151.65},{\"id\":1,\"name\":\"巴黎风情\",\"score\":134.21},{\"id\":1,\"name\":\"滨海火车\",\"score\":154.46},{\"id\":11,\"name\":\"野外修炼馆\",\"score\":136.59},{\"id\":10,\"name\":\"城镇手指\",\"score\":127.81},{\"id\":12,\"name\":\"里约滑坡\",\"score\":113.11},{\"id\":13,\"name\":\"360塔楼\",\"score\":135.09},{\"id\":13,\"name\":\"恐龙决斗场\",\"score\":159.41},{\"id\":14,\"name\":\"浮空要塞\",\"score\":140.73},{\"id\":15,\"name\":\"遗忘孤城\",\"score\":202.43},{\"id\":16,\"name\":\"城镇命运之桥\",\"score\":214.35},{\"id\":17,\"name\":\"龙之路\",\"score\":106.42},{\"id\":18,\"name\":\"神秘研究所\",\"score\":212.39},{\"id\":19,\"name\":\"玩具工厂\",\"score\":115.74},{\"id\":19,\"name\":\"龙之冰灯祭\",\"score\":128.48},{\"id\":19,\"name\":\"铃鹿赛道\",\"score\":155.71},{\"id\":19,\"name\":\"太空军用机场\",\"score\":201.97},{\"id\":19,\"name\":\"城镇高速公路(反向)\",\"score\":151.43},{\"id\":19,\"name\":\"城镇极限竞技场\",\"score\":152.41},{\"id\":19,\"name\":\"巴黎铁塔\",\"score\":207.73},{\"id\":19,\"name\":\"意大利比萨斜塔\",\"score\":109.16},{\"id\":20,\"name\":\"龙之遗迹\",\"score\":148.41},{\"id\":21,\"name\":\"万里长城\",\"score\":151.7},{\"id\":22,\"name\":\"海盗绝壁海湾\",\"score\":202.33},{\"id\":23,\"name\":\"海底神殿\",\"score\":228.27},{\"id\":24,\"name\":\"纽约狂飙\",\"score\":220.82},{\"id\":24,\"name\":\"森林发夹\",\"score\":220.82},{\"id\":25,\"name\":\"英特拉格斯\",\"score\":155.79},{\"id\":26,\"name\":\"沙漠旋转工地\",\"score\":205.41},{\"id\":27,\"name\":\"大城堡秘密地下室\",\"score\":210.73},{\"id\":28,\"name\":\"黄山赛道\",\"score\":115.31},{\"id\":29,\"name\":\"海盗宝藏迷宫\",\"score\":211.87},{\"id\":30,\"name\":\"城镇公路\",\"score\":116.48},{\"id\":33,\"name\":\"冰峰裂谷\",\"score\":145.75},{\"id\":34,\"name\":\"圣诞秘密空间\",\"score\":143.94},{\"id\":31,\"name\":\"黄金坐标\",\"score\":141.4},{\"id\":32,\"name\":\"秘密机关的威胁\",\"score\":201.55},{\"id\":32,\"name\":\"街头狂飙\",\"score\":218.73},{\"id\":35,\"name\":\"彩虹之门\",\"score\":211.49},{\"id\":36,\"name\":\"太空蜿蜒跑道\",\"score\":201.31},{\"id\":37,\"name\":\"矿山曲折滑坡\",\"score\":122.96},{\"id\":38,\"name\":\"未完成的第五区\",\"score\":123.2},{\"id\":39,\"name\":\"森林崎岖下山道\",\"score\":149.24},{\"id\":40,\"name\":\"幽暗峡谷\",\"score\":201.67},{\"id\":41,\"name\":\"冰山滑雪场\",\"score\":225.7},{\"id\":41,\"name\":\"森林发夹(反向)\",\"score\":221.68}]".let {
                GameMapTools().resetId(it)
            }.let {
                println(it)
            }
        }

    }

    fun resetId(str: String) =
        str.fromJson<List<GameMap>>().also {
            it.forEachIndexed { index, gameMap ->
                gameMap.id = index + 1
                gameMap.topScore = gameMap.score
            }
        }.toJson()

}