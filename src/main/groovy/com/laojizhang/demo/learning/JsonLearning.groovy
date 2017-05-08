package com.laojizhang.demo.learning

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

public class JsonLearning {

    def jsonTxt = '''{"nextUrl":"http://apis.wandoujia.com/five/v2/apps/tops/weeklytopapp?v=5.17.1&deviceId=ODY2NjU0MDI3MjYwNDAy&sdk=22&id=wandoujia_android&launchedCount=7&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&channel=wandoujia_pc_wandoujia2_homepage&rippleSupported=false&vc=12029&capacity=3&launchedAge=0&start=5&max=5","preUrl":"","hasMore":true,"pbVersion":0,"sessionId":"","entity":[{"idString":"com.tencent.mm","title":"微信","icon":"http://img.wdjimg.com/mms/icon/v1/7/ed/15891412e00a12fdec0bbe290b42ced7_256_256.png","tagLine":"本周 10 万人安装 40.43M","templateType":"SINGLE_MINI","description":"可以发语音、文字消息、表情、图片、视频。30M 流量可以收发上千条语音，省电省流量。","subTitle":"40.4MB","contentType":"APP","detail":{"appDetail":{"detailParam":"pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp","installedCountStr":"6.2 亿","packageName":"com.tencent.mm","apk":[{"bytes":42394725,"compatible":1,"downloadUrl":{"aggrWeight":30,"market":"优亿市场","referUrl":"http://partner.eoemarket.com/wandoujia/show/index/appId/28366","url":"http://apps.wandoujia.com/redirect?signature=e589551&url=http%3A%2F%2Fdownload.eoemarket.com%2Fapp%3Fchannel_id%3D100%26client_id%26id%3D28366&pn=com.tencent.mm&md5=a57eb927aa21ab73d521be20dd0bf61b&apkid=20829428&vc=1041&size=42394725&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&tokenId=oscar&pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"incompatibleDetail":null,"md5":"a57eb927aa21ab73d521be20dd0bf61b","packageName":"com.tencent.mm","signature":"e52b50104f9c9179ac61f860d4410945","size":"40.43M","versionCode":1041}],"award":{"issue":null},"extensionPack":[],"appType":"APP","tag":[]}},"action":{"intent":"wdj://apps/com.tencent.mm","url":"http://apis.wandoujia.com/five/v2/apps/com.tencent.mm?pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"badge":256,"symbol":"1.","tag":[],"cover":[],"iconImage":{"url":"http://img.wdjimg.com/mms/icon/v1/7/ed/15891412e00a12fdec0bbe290b42ced7_256_256.png"},"subEntity":[]},{"idString":"com.achievo.vipshop","title":"唯品会","icon":"http://img.wdjimg.com/mms/icon/v1/0/8d/f1186ce25a192c2226cb695b528b68d0_256_256.png","tagLine":"本周 5.2 万人安装 33.33M","templateType":"SINGLE_MINI","description":"一家专门做特卖的网站","subTitle":"33.3MB","contentType":"APP","detail":{"appDetail":{"detailParam":"pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp","installedCountStr":"3735 万","packageName":"com.achievo.vipshop","apk":[{"bytes":34945647,"compatible":1,"downloadUrl":{"aggrWeight":300,"market":"官方","referUrl":"http://apps.wandoujia.com/apps/com.achievo.vipshop?uid=5236511","url":"http://apps.wandoujia.com/redirect?signature=106c959&url=http%3A%2F%2Fapk.wandoujia.com%2F5%2F8b%2Fd4b1c77fe18edb7681460dde7ec4a8b5.apk&pn=com.achievo.vipshop&md5=d4b1c77fe18edb7681460dde7ec4a8b5&apkid=21038326&vc=659&size=34945647&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&tokenId=oscar&pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"incompatibleDetail":null,"md5":"d4b1c77fe18edb7681460dde7ec4a8b5","packageName":"com.achievo.vipshop","signature":"4e4511e7c2478da1e2a55f40e5fcd534","size":"33.33M","versionCode":659}],"award":{"issue":null},"extensionPack":[],"appType":"APP","tag":[]}},"action":{"intent":"wdj://apps/com.achievo.vipshop","url":"http://apis.wandoujia.com/five/v2/apps/com.achievo.vipshop?pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"badge":256,"symbol":"2.","tag":[],"cover":[],"iconImage":{"url":"http://img.wdjimg.com/mms/icon/v1/0/8d/f1186ce25a192c2226cb695b528b68d0_256_256.png"},"subEntity":[]},{"idString":"com.tencent.mobileqq","title":"QQ","icon":"http://img.wdjimg.com/mms/icon/v1/4/c6/e3ff9923c44e59344e8b9aa75e948c64_256_256.png","tagLine":"本周 8.1 万人安装 38.45M","templateType":"SINGLE_MINI","description":"QQ手机版，致力于更完美的移动社交、娱乐与生活体验。乐在沟通15年。","subTitle":"38.5MB","contentType":"APP","detail":{"appDetail":{"detailParam":"pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp","installedCountStr":"6.5 亿","packageName":"com.tencent.mobileqq","apk":[{"bytes":40313598,"compatible":1,"downloadUrl":{"aggrWeight":300,"market":"官方","referUrl":"http://apps.wandoujia.com/apps/com.tencent.mobileqq?uid=10417260","url":"http://apps.wandoujia.com/redirect?signature=1a8cc39&url=http%3A%2F%2Fapk.wandoujia.com%2Fc%2Fac%2F1e9867bea9b5deede24353835cfc3acc.apk&pn=com.tencent.mobileqq&md5=1e9867bea9b5deede24353835cfc3acc&apkid=20817794&vc=500&size=40313598&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&tokenId=oscar&pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"incompatibleDetail":null,"md5":"1e9867bea9b5deede24353835cfc3acc","packageName":"com.tencent.mobileqq","signature":"c7b90893386f1cda9dabe34eb5865539","size":"38.45M","versionCode":500}],"award":{"issue":null},"extensionPack":[],"appType":"APP","tag":[]}},"action":{"intent":"wdj://apps/com.tencent.mobileqq","url":"http://apis.wandoujia.com/five/v2/apps/com.tencent.mobileqq?pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"badge":256,"symbol":"3.","tag":[],"cover":[],"iconImage":{"url":"http://img.wdjimg.com/mms/icon/v1/4/c6/e3ff9923c44e59344e8b9aa75e948c64_256_256.png"},"subEntity":[]},{"idString":"com.ss.android.article.news","title":"今日头条","icon":"http://img.wdjimg.com/mms/icon/v1/4/97/4b8356b706e0048b4ca9677c426c3974_256_256.png","tagLine":"本周 5.9 万人安装 12.86M","templateType":"SINGLE_MINI","description":"新鲜的新闻推荐模式，只用5秒钟，就可以为你推荐你喜欢的新闻。","subTitle":"12.9MB","contentType":"APP","detail":{"appDetail":{"detailParam":"pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp","installedCountStr":"1 亿","packageName":"com.ss.android.article.news","apk":[{"bytes":13485294,"compatible":1,"downloadUrl":{"aggrWeight":300,"market":"官方","referUrl":"http://apps.wandoujia.com/apps/com.ss.android.article.news?uid=1637868","url":"http://apps.wandoujia.com/redirect?signature=4b943b2&url=http%3A%2F%2Fapk.wandoujia.com%2F3%2F7c%2F795b3b81002146aeea5d11598651a7c3.apk&pn=com.ss.android.article.news&md5=795b3b81002146aeea5d11598651a7c3&apkid=21056080&vc=612&size=13485294&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&tokenId=oscar&pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"incompatibleDetail":null,"md5":"795b3b81002146aeea5d11598651a7c3","packageName":"com.ss.android.article.news","signature":"a0da543f69f4b3a2070f097ee4fd8de6","size":"12.86M","versionCode":612}],"award":{"issue":null},"extensionPack":[],"appType":"APP","tag":[]}},"action":{"intent":"wdj://apps/com.ss.android.article.news","url":"http://apis.wandoujia.com/five/v2/apps/com.ss.android.article.news?pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"badge":256,"symbol":"4.","tag":[],"cover":[],"iconImage":{"url":"http://img.wdjimg.com/mms/icon/v1/4/97/4b8356b706e0048b4ca9677c426c3974_256_256.png"},"subEntity":[]},{"idString":"com.Qunar","title":"去哪儿旅行","icon":"http://img.wdjimg.com/mms/icon/v1/6/4e/01602a98d5813728b8cc200e994de4e6_256_256.png","tagLine":"本周 2.4 万人安装 41.34M","templateType":"SINGLE_MINI","description":"汽车火车飞机，酒店客栈以及景区门票，为你提供多种优惠。","subTitle":"41.3MB","contentType":"APP","detail":{"appDetail":{"detailParam":"pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp","installedCountStr":"3.5 亿","packageName":"com.Qunar","apk":[{"bytes":43348458,"compatible":1,"downloadUrl":{"aggrWeight":300,"market":"官方","referUrl":"http://apps.wandoujia.com/apps/com.Qunar?uid=3260417","url":"http://apps.wandoujia.com/redirect?signature=4174c42&url=http%3A%2F%2Fapk.wandoujia.com%2F9%2F94%2Fd806cb7fc176a84a5dfd23ed5a21a949.apk&pn=com.Qunar&md5=d806cb7fc176a84a5dfd23ed5a21a949&apkid=21000122&vc=135&size=43348458&udid=9858a9f26eaa4c78bf7160f552f72a9e196b81fd&tokenId=oscar&pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"incompatibleDetail":null,"md5":"d806cb7fc176a84a5dfd23ed5a21a949","packageName":"com.Qunar","signature":"7f8fe549a69b6223776f239422614928","size":"41.34M","versionCode":135}],"award":{"issue":null},"extensionPack":[],"appType":"APP","tag":[]}},"action":{"intent":"wdj://apps/com.Qunar","url":"http://apis.wandoujia.com/five/v2/apps/com.Qunar?pos=m%2Fapps%2Ftops%2Fweeklytopapp%2Fapps%2Ftops%2Fweeklytopapp"},"badge":256,"symbol":"5.","tag":[],"cover":[],"iconImage":{"url":"http://img.wdjimg.com/mms/icon/v1/6/4e/01602a98d5813728b8cc200e994de4e6_256_256.png"},"subEntity":[]}],"status":-200}'''

    static void main(String[] args) {
        PrintUtils.printCutLine("JsonLearning")
        JsonLearning jsonLearning = new JsonLearning()
        jsonLearning.jsonSlurperTest()

        PrintUtils.printCutLine()
        jsonLearning.jsonOutputTest()
    }

    def jsonSlurperTest() {
        def jsonSlurper = new JsonSlurper()
        def response = jsonSlurper.parseText(jsonTxt)

        assert response instanceof Map
        assert response.entity instanceof List
        response.entity.each {
            println it
        }
    }

    def jsonOutputTest() {
        def json = JsonOutput.toJson(["isPlaying": true, "classLearnings": [new ClassLearning(name: "老机长", age: 18, language: "Chinese"), new ClassLearning(name: "pighead", age: 20, language: "Chinese")]])
        println json
    }
}