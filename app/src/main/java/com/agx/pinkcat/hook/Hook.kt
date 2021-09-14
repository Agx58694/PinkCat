package com.agx.pinkcat.hook

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage

class Hook : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam?) {
        if(lpparam?.packageName != "com.dress.fun1") return
        hookIsVip(lpparam.classLoader)
        hookAssetsInfo(lpparam.classLoader)
        hookDressUpTexture(lpparam.classLoader)
        hookDressUpVipModelBean(lpparam.classLoader)
        hookLive2dBackGround(lpparam.classLoader)
        hookLiveDressSuits(lpparam.classLoader)
        hookSkinResult(lpparam.classLoader)
    }

    private fun hookIsVip(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.UserInfo",classLoader,"is_vip",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 2
                XposedBridge.log("hookIsVip:已劫持vip")
            }
        })
    }

    private fun hookDressUpTexture(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.DressUpTexture",classLoader,"getCan_use",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookDressUpTexture:已劫持getCan_use")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.DressUpTexture",classLoader,"getPay_mode",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 6
                XposedBridge.log("hookDressUpTexture:已劫持getPay_mode")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.DressUpTexture",classLoader,"is_own",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookDressUpTexture:已劫持getPay_mode")
            }
        })
    }

    private fun hookLiveDressSuits(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.LiveDressSuits",classLoader,"getCan_use",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookLiveDressSuits:已劫持getCan_use")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.LiveDressSuits",classLoader,"getPay_mode",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 6
                XposedBridge.log("hookLiveDressSuits:已劫持getPay_mode")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.LiveDressSuits",classLoader,"is_own",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookLiveDressSuits:已劫持is_own")
            }
        })
    }

    private fun hookDressUpVipModelBean(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.DressUpVipModelBean",classLoader,"getCan_use",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookDressUpVipModelBean:已劫持getCan_use")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.DressUpVipModelBean",classLoader,"getPay_mode",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 6
                XposedBridge.log("hookDressUpVipModelBean:已劫持getPay_mode")
            }
        })
    }

    private fun hookLive2dBackGround(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.Live2dBackGround",classLoader,"getCan_use",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookLive2dBackGround:已劫持getCan_use")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.Live2dBackGround",classLoader,"getPay_mode",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 6
                XposedBridge.log("hookLive2dBackGround:已劫持getPay_mode")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.Live2dBackGround",classLoader,"is_own",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 1
                XposedBridge.log("hookLive2dBackGround:已劫持is_own")
            }
        })
    }

    private fun hookAssetsInfo(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.AssetsInfo",classLoader,"getCoins",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 999999
                XposedBridge.log("hookAssetsInfo:已劫持getCoins")
            }
        })
        XposedHelpers.findAndHookMethod("com.dresses.library.api.AssetsInfo",classLoader,"getCoupon_blind",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 999
                XposedBridge.log("hookAssetsInfo:已劫持getCoupon_blind")
            }
        })
    }

    private fun hookSkinResult(classLoader: ClassLoader){
        XposedHelpers.findAndHookMethod("com.dresses.library.api.BaseResponse",classLoader,"getCode",object : XC_MethodHook(){
            override fun beforeHookedMethod(param: MethodHookParam?) {
                super.beforeHookedMethod(param)
                param?.result = 200
                XposedBridge.log("hookSkinResult:已劫持getCode")
            }
        })
    }
}