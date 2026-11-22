package com.yydcdut.markdowndemo;

import android.os.Environment;

import java.io.File;

/**
 * Created by yuyidong on 16/5/11.
 */
public interface Const {

    String MD_SAMPLE = "鍦ㄨ繖涓?*鐗堟湰**涓垜浠?澧炲姞test*浜?`Markdown` 鍔熻兘銆俙Markdown` 鏄瘇~涓€绉嶄娇鐢ㄧ函鏂囨湰缂栧啓鐨勬爣璁皛~璇█锛屽彲浠ヤ骇鐢熸牸寮?[test](http://7xs03u.com1.z0.glb.clouddn.com/dex_dexopt_dex2oat.png/320$320)涓板瘜鐨勯〉闈^鎺掔増鏁堟灉]锛屾瘮濡傜獊鍑篬鏍囬](http://www.baidu.com)銆佸眳涓€佸姞绮椼€佸紩鐢ㄥ拰鐢熸垚鍒楄〃銆?https://www.google.com \n" +
            "\n" +
            "## **鐢ㄦ硶涓庤鍒欙細**\n" +
            "\n" +
            "浣犲彲浠ユ墜鍔ㄨ緭鍏ワ紝涔熷彲浠ョ偣鍑婚敭鐩樹笂鏂圭殑鎸夐挳蹇€熻緭鍏?Markdown 绗﹀彿銆俓n" +
            "\n" +
            "### **鏍囬**\n" +
            "浣跨敤鈥?鈥濆姞绌烘牸鍦?琛岄*鏉ュ垱寤烘爣棰?[test](drawable://" + R.drawable.desktop_device + "/300$300)\n" +
            "***\n" +
            "\n" +
            "```\n" +
            "test1\n" +
            "test2\n" +
            "test3\n" +
            "test4\n" +
            "```\n" +
            "\n" +
            "- [ ] 123\n" +
            "- [ ] 456\n" +
            "- [ ] 789\n" +
            "\n" +
            "- [x] 987\n" +
            "- [x] 654\n" +
            "- [x] 321\n" +
            "\n" +
            "渚嬪锛歕n" +
            "# 涓€绾ф爣棰榎n" +
            "## 浜岀骇鏍囬\n" +
            "### 涓夌骇鏍囬\n" +
            "---\n" +
            "![test](file://" + Environment.getExternalStorageDirectory() + File.separator + "b.jpg/400$400" + ")\n" +
            "### **鍔犵矖鍔熻兘**\n" +
            "浣跨敤涓€缁勬槦鍙封€?*鈥濇潵鍔犵矖涓€娈垫枃瀛梊n" +
            "\n" +
            "```c\n" +
            "test1\n" +
            "test2\n" +
            "test3\n" +
            "test4\n" +
            "```" +
//            "渚嬪锛歕n" +
//            "杩欐槸**鍔犵矖鐨勬枃瀛?*\n" +
            "\n" +
            "### **灞呬腑**\n" +
            "浣跨敤涓€瀵逛腑鎷彿鈥淸鏂囧瓧]鈥濇潵灞呬腑涓€娈垫枃瀛楋紝涔熷彲![test](assets://bb.jpg/100$100)浠ュ拰鏍囬鍙犲姞浣跨敤\n" +
            "\n" +
            "渚嬪锛歕n" +
            "[### 杩欐槸涓€涓眳涓殑鏍囬]\n" +
            "\n" +
            "### **寮曠敤**\n" +
            "浣跨敤鈥? 鈥濆湪娈甸鏉ュ紩鐢ㄤ竴娈垫枃瀛梊n" +
            "\n" +
            "渚嬪锛歕n" +
            "> 杩欐槸涓€娈靛紩鐢╘n" +
            "> > > 杩欐槸涓€娈靛紩鐢╘n" +
            "\n" +
            "### **鏃犲簭鍒楄〃**\n" +
            "浣跨敤 鈥?鈥濄€佲€?鈥濇垨鈥?鈥濆姞绌烘牸 鏉ュ垱寤烘棤搴忓垪琛╘n" +
            "\n" +
            "渚嬪锛歕n" +
            "- 杩欐槸涓€涓棤搴忓垪琛╘n" +
            "+ 杩欐槸涓€涓棤搴忓垪琛╘n" +
            "* 杩欐槸涓€涓棤搴忓垪琛╘n" +
            "\n" +
            "### **鏈夊簭鍒楄〃**\n" +
            "浣跨敤 鏁板瓧鍦嗙偣鍔犵┖鏍?濡傗€?. 鈥濄€佲€?. 鈥濇潵鍒涘缓鏈夊簭鍒楄〃\n" +
            "\n" +
            "```java\n" +
            "public abstract class MemberIdsSection extends UniformItemSection {\n" +
            "  /** {@inheritDoc} */\n" +
            "    @Override\n" +
            "    protected void orderItems() {\n" +
            "        int idx = 0;\n" +
            "\n" +
            "        if (items().size() > DexFormat.MAX_MEMBER_IDX + 1) {\n" +
            "            throw new DexIndexOverflowException(getTooManyMembersMessage());\n" +
            "        }\n" +
            "\n" +
            "        for (Object i : items()) {\n" +
            "            ((MemberIdItem) i).setIndex(idx);\n" +
            "            idx++;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private String getTooManyMembersMessage() {\n" +
            "        Map<String, AtomicInteger> membersByPackage = new TreeMap<String, AtomicInteger>();\n" +
            "        for (Object member : items()) {\n" +
            "            String packageName = ((MemberIdItem) member).getDefiningClass().getPackageName();\n" +
            "            AtomicInteger count = membersByPackage.get(packageName);\n" +
            "            if (count == null) {\n" +
            "                count = new AtomicInteger();\n" +
            "                membersByPackage.put(packageName, count);\n" +
            "            }\n" +
            "            count.incrementAndGet();\n" +
            "        }\n" +
            "\n" +
            "        Formatter formatter = new Formatter();\n" +
            "        try {\n" +
            "            String memberType = this instanceof MethodIdsSection ? \"method\" : \"field\";\n" +
            "            formatter.format(\"Too many %s references: %d; max is %d.%n\" +\n" +
            "                    Main.getTooManyIdsErrorMessage() + \"%n\" +\n" +
            "                    \"References by package:\",\n" +
            "                    memberType, items().size(), DexFormat.MAX_MEMBER_IDX + 1);\n" +
            "            for (Map.Entry<String, AtomicInteger> entry : membersByPackage.entrySet()) {\n" +
            "                formatter.format(\"%n%6d %s\", entry.getValue().get(), entry.getKey());\n" +
            "            }\n" +
            "            return formatter.toString();\n" +
            "        } finally {\n" +
            "            formatter.close();\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "```\n" +
            "渚嬪锛歕n" +
            "1. 杩欐槸涓€涓湁搴忓垪琛╘n" +
            "2. 杩欐槸涓€涓湁搴忓垪琛╘n" +
            "3. 杩欐槸涓€涓湁搴忓垪琛?;

    String MD_SAMPLE2 =
            "褰撶▼搴忚秺鏉ヨ秺澶т箣鍚庯紝鍑虹幇浜嗕竴涓?dex 鍖呰涓嶄笅鐨勬儏鍐碉紝閫氳繃 `MultiDex` 鐨勬柟娉曡В鍐充簡杩欎釜闂锛屼絾鏄湪搴曠鏈哄櫒涓婂張鍑虹幇浜?`INSTALL_FAILED_DEXOPT` 鐨勬儏鍐碉紝閭ｅ啀瑙ｅ喅杩欎釜闂鍚с€傜瓑瑙ｅ喅瀹岃繖涓棶棰樹箣鍚庯紝鍙戠幇闇€瑕佸～鐨勫潙瓒婃潵瓒婂浜嗭紝鏂囩珷璁茬殑鏄垜鍦ㄥ垎鍖呭鐞嗕腑濉殑鍧戯紝姣斿 65536銆丩inearAlloc銆丯oClassDefFoundError绛夌瓑銆俓n" +
                    "\n" +
                    "<!-- more -->\n" +
                    "\n" +
                    "## INSTALL_FAILED_DEXOPT\n" +
                    "\n" +
                    "INSTALL_FAILED_DEXOPT 鍑虹幇鐨勫師鍥犲ぇ閮ㄥ垎閮芥槸涓ょ锛屼竴绉嶆槸 65536 浜嗭紝鍙﹀涓€绉嶆槸 `LinearAlloc` 澶皬浜嗐€備袱鑰呯殑闄愬埗涓嶅悓锛屼絾鏄師鍥犲嵈鏄浉浼硷紝閭ｅ氨鏄疉pp澶ぇ浜嗭紝瀵艰嚧娌″姙娉曞畨瑁呭埌鎵嬫満涓娿€俓n" +
                    "\n" +
                    "### 65536\n" +
                    "\n" +
                    "> trouble writing output: Too many method references: 70048; max is 65536.\n" +
                    "\n" +
                    "鎴栬€匼n" +
                    "\n" +
                    "> UNEXPECTED TOP-LEVEL EXCEPTION: java.lang.IllegalArgumentException: method ID not in [0, 0xffff]: 65536 \n" +
                    "> \u200B\tat com.android.dx.merge.DexMerger$6.updateIndex(DexMerger.java:501) \n" +
                    "> \u200B\tat com.android.dx.merge.DexMerger$IdMerger.mergeSorted(DexMerger.java:276) \n" +
                    "> \u200B\tat com.android.dx.merge.DexMerger.mergeMethodIds(DexMerger.java:490) \n" +
                    "> \u200B\tat com.android.dx.merge.DexMerger.mergeDexes(DexMerger.java:167) \n" +
                    "> \u200B\tat com.android.dx.merge.DexMerger.merge(DexMerger.java:188) \n" +
                    "> \u200B\tat com.android.dx.command.dexer.Main.mergeLibraryDexBuffers(Main.java:439) \n" +
                    "> \u200B\tat com.android.dx.command.dexer.Main.runMonoDex(Main.java:287) \n" +
                    "> \u200B\tat com.android.dx.command.dexer.Main.run(Main.java:230) \n" +
                    "> \u200B\tat com.android.dx.command.dexer.Main.main(Main.java:199) \n" +
                    "> \u200B\tat com.android.dx.command.Main.main(Main.java:103):Derp:dexDerpDebug FAILED\n" +
                    "\n" +
                    "#### 缂栬瘧鐜\n" +
                    "\n" +
                    "```\n" +
                    "buildscript {\n" +
                    "    repositories {\n" +
                    "        jcenter()\n" +
                    "    }\n" +
                    "    dependencies {\n" +
                    "        classpath 'com.android.tools.build:gradle:1.3.0'\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "android {\n" +
                    "    compileSdkVersion 23\n" +
                    "    buildToolsVersion \"24.0.0rc1\"\n" +
                    "\t//....\n" +
                    "    defaultConfig {\n" +
                    "        minSdkVersion 14\n" +
                    "        targetSdkVersion 23\n" +
                    "        //....\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "#### 涓轰粈涔堟槸65536\n" +
                    "\n" +
                    "鏍规嵁  [StackOverFlow -- Does the Android ART runtime have the same method limit limitations as Dalvik?](http://stackoverflow.com/questions/21490382/does-the-android-art-runtime-have-the-same-method-limit-limitations-as-dalvik/21492160#21492160) 涓婇潰鐨勮娉曪紝鏄洜涓?Dalvik 鐨?invoke-kind 鎸囦护闆嗕腑锛宮ethod reference index 鍙暀浜?16 bits锛屾渶澶氳兘**寮曠敤** 65535 涓柟娉曘€俒Dalvik bytecode](https://source.android.com/devices/tech/dalvik/dalvik-bytecode.html) 锛歕n" +
                    "\n" +
                    "> | Op & Format | Mnemonic / Syntax                        | Arguments                                |\n" +
                    "> | :---------: | ---------------------------------------- | ---------------------------------------- |\n" +
                    "> | 6e..72 35c  | invoke-*kind* {vC, vD, vE, vF, vG}, meth@BBBB6e: invoke-virtual6f: invoke-super70: invoke-direct71: invoke-static72: invoke-interface | `A:` argument word count (4 bits)`B:` method reference index (16 bits)`C..G:` argument registers (4 bits each) |\n" +
                    "\n" +
                    "鍗充娇 dex 閲岄潰鐨勫紩鐢ㄦ柟娉曟暟瓒呰繃浜?65536锛岄偅涔熷彧鏈夊墠闈㈢殑 65536 寰楃殑鍒拌皟鐢ㄣ€傛墍浠ヨ繖涓笉鏄?dex 鐨勫師鍥犮€傚叾娆★紝鏃㈢劧鍜?dex 娌℃湁鍏崇郴锛岄偅鍦ㄦ墦鍖?dex 鐨勬椂鍊欎负浠€涔堜細鎶ラ敊銆傛垜浠厛瀹氫綅 `Too many` 鍏抽敭瀛楋紝瀹氫綅鍒颁簡 [MemberIdsSection](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/dex/file/MemberIdsSection.java) 锛歕n" +
                    "\n" +
                    "```\n" +
                    "public abstract class MemberIdsSection extends UniformItemSection {\n" +
                    "  /** {@inheritDoc} */\n" +
                    "    @Override\n" +
                    "    protected void orderItems() {\n" +
                    "        int idx = 0;\n" +
                    "\n" +
                    "        if (items().size() > DexFormat.MAX_MEMBER_IDX + 1) {\n" +
                    "            throw new DexIndexOverflowException(getTooManyMembersMessage());\n" +
                    "        }\n" +
                    "\n" +
                    "        for (Object i : items()) {\n" +
                    "            ((MemberIdItem) i).setIndex(idx);\n" +
                    "            idx++;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    private String getTooManyMembersMessage() {\n" +
                    "        Map<String, AtomicInteger> membersByPackage = new TreeMap<String, AtomicInteger>();\n" +
                    "        for (Object member : items()) {\n" +
                    "            String packageName = ((MemberIdItem) member).getDefiningClass().getPackageName();\n" +
                    "            AtomicInteger count = membersByPackage.get(packageName);\n" +
                    "            if (count == null) {\n" +
                    "                count = new AtomicInteger();\n" +
                    "                membersByPackage.put(packageName, count);\n" +
                    "            }\n" +
                    "            count.incrementAndGet();\n" +
                    "        }\n" +
                    "\n" +
                    "        Formatter formatter = new Formatter();\n" +
                    "        try {\n" +
                    "            String memberType = this instanceof MethodIdsSection ? \"method\" : \"field\";\n" +
                    "            formatter.format(\"Too many %s references: %d; max is %d.%n\" +\n" +
                    "                    Main.getTooManyIdsErrorMessage() + \"%n\" +\n" +
                    "                    \"References by package:\",\n" +
                    "                    memberType, items().size(), DexFormat.MAX_MEMBER_IDX + 1);\n" +
                    "            for (Map.Entry<String, AtomicInteger> entry : membersByPackage.entrySet()) {\n" +
                    "                formatter.format(\"%n%6d %s\", entry.getValue().get(), entry.getKey());\n" +
                    "            }\n" +
                    "            return formatter.toString();\n" +
                    "        } finally {\n" +
                    "            formatter.close();\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "`items().size() > DexFormat.MAX_MEMBER_IDX + 1 ` 锛岄偅 [DexFormat](https://github.com/yydcdut/android_libcore/blob/kitkat/dex/src/main/java/com/android/dex/DexFormat.java) 鐨勫€兼槸锛歕n" +
                    "\n" +
                    "```\n" +
                    "public final class DexFormat {\n" +
                    "  /**\n" +
                    "     * Maximum addressable field or method index.\n" +
                    "     * The largest addressable member is 0xffff, in the \"instruction formats\" spec as field@CCCC or\n" +
                    "     * meth@CCCC.\n" +
                    "     */\n" +
                    "    public static final int MAX_MEMBER_IDX = 0xFFFF;\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "dx 鍦ㄨ繖閲屽仛浜嗗垽鏂紝褰撳ぇ浜?65536 鐨勬椂鍊欏氨鎶涘嚭寮傚父浜嗐€傛墍浠ュ湪鐢熸垚 dex 鏂囦欢鐨勮繃绋嬩腑锛屽綋璋冪敤鏂规硶鏁颁笉鑳借秴杩?65535 銆傞偅鎴戜滑鍐嶈窡涓€璺熶唬鐮侊紝鍙戠幇 `MemberIdsSection` 鐨勪竴涓瓙绫诲彨  [MethodidsSection](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/dex/file/MethodIdsSection.java) 锛歕n" +
                    "\n" +
                    "```\n" +
                    "public final class MethodIdsSection extends MemberIdsSection {}\n" +
                    "```\n" +
                    "\n" +
                    "鍥炶繃澶存潵锛岀湅涓€涓?`orderItems()` 鏂规硶鍦ㄥ摢閲岃璋冪敤浜嗭紝璺熷埌浜?`MemberIdsSection` 鐨勭埗绫?[UniformItemSection](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/dex/file/UniformItemSection.java) :\n" +
                    "\n" +
                    "```\n" +
                    "public abstract class UniformItemSection extends Section {\n" +
                    "\t@Override\n" +
                    "    protected final void prepare0() {\n" +
                    "        DexFile file = getFile();\n" +
                    "\n" +
                    "        orderItems();\n" +
                    "\n" +
                    "        for (Item one : items()) {\n" +
                    "            one.addContents(file);\n" +
                    "        }\n" +
                    "    }\n" +
                    "  \t\n" +
                    "\tprotected abstract void orderItems();\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鍐嶈窡涓€涓?`prepare0` 鍦ㄥ摢閲岃璋冪敤锛屾煡鍒颁簡 `UniformItemSection` 鐖剁被 [Section](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/dex/file/Section.java) :\n" +
                    "\n" +
                    "```\n" +
                    "public abstract class Section {\n" +
                    "\tpublic final void prepare() {\n" +
                    "        throwIfPrepared();\n" +
                    "        prepare0();\n" +
                    "        prepared = true;\n" +
                    "    }\n" +
                    "  \t\n" +
                    "  \tprotected abstract void prepare0();\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "閭ｇ幇鍦ㄥ啀璺熶竴涓?`prepare()` 锛屾煡鍒?[DexFile](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/dex/file/DexFile.java) 涓湁璋冪敤锛歕n" +
                    "\n" +
                    "```\n" +
                    "public final class DexFile {\n" +
                    "  private ByteArrayAnnotatedOutput toDex0(boolean annotate, boolean verbose) {\n" +
                    "        classDefs.prepare();\n" +
                    "        classData.prepare();\n" +
                    "        wordData.prepare();\n" +
                    "        byteData.prepare();\n" +
                    "        methodIds.prepare();\n" +
                    "        fieldIds.prepare();\n" +
                    "        protoIds.prepare();\n" +
                    "        typeLists.prepare();\n" +
                    "        typeIds.prepare();\n" +
                    "        stringIds.prepare();\n" +
                    "        stringData.prepare();\n" +
                    "        header.prepare();\n" +
                    "\t\t//blablabla......\n" +
                    "  \t}\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "閭ｅ啀鐪嬩竴涓?`toDex0()` 鍚э紝鍥犱负鏄?private 鐨勶紝鐩存帴鍦ㄧ被涓壘璋冪敤鐨勫湴鏂瑰氨鍙互浜嗭細\n" +
                    "\n" +
                    "```\n" +
                    "public final class DexFile {\n" +
                    "\tpublic byte[] toDex(Writer humanOut, boolean verbose) throws IOException {\n" +
                    "        boolean annotate = (humanOut != null);\n" +
                    "        ByteArrayAnnotatedOutput result = toDex0(annotate, verbose);\n" +
                    "\n" +
                    "        if (annotate) {\n" +
                    "            result.writeAnnotationsTo(humanOut);\n" +
                    "        }\n" +
                    "\n" +
                    "        return result.getArray();\n" +
                    "    }\n" +
                    "\n" +
                    "  \tpublic void writeTo(OutputStream out, Writer humanOut, boolean verbose) throws IOException {\n" +
                    "        boolean annotate = (humanOut != null);\n" +
                    "        ByteArrayAnnotatedOutput result = toDex0(annotate, verbose);\n" +
                    "\n" +
                    "        if (out != null) {\n" +
                    "            out.write(result.getArray());\n" +
                    "        }\n" +
                    "\n" +
                    "        if (annotate) {\n" +
                    "            result.writeAnnotationsTo(humanOut);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鍏堟悳鎼?`toDex()` 鏂规硶鍚э紝鏈€缁堝彂鐜板湪 [com.android.dx.command.dexer.Main](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/command/dexer/Main.java) 涓細\n" +
                    "\n" +
                    "```\n" +
                    "public class Main {\n" +
                    "\tprivate static byte[] writeDex(DexFile outputDex) {\n" +
                    "        byte[] outArray = null;\n" +
                    "      \t//blablabla......\n" +
                    "\t\tif (args.methodToDump != null) {\n" +
                    "\t\t\toutputDex.toDex(null, false);\n" +
                    "            dumpMethod(outputDex, args.methodToDump, humanOutWriter);\n" +
                    "\t\t} else {\n" +
                    "\t\t\toutArray = outputDex.toDex(humanOutWriter, args.verboseDump);\n" +
                    "\t\t}\n" +
                    "\t\t//blablabla......\n" +
                    "        return outArray;\n" +
                    "    }\n" +
                    "  \t//璋冪敤writeDex鐨勫湴鏂筡n" +
                    "  \tprivate static int runMonoDex() throws IOException {\n" +
                    "  \t\t//blablabla......\n" +
                    "      \toutArray = writeDex(outputDex);\n" +
                    "      \t//blablabla......\n" +
                    "\t}\n" +
                    "  \t//璋冪敤runMonoDex鐨勫湴鏂筡n" +
                    "  \tpublic static int run(Arguments arguments) throws IOException {\n" +
                    "  \t\tif (args.multiDex) {\n" +
                    "\t\t\treturn runMultiDex();\n" +
                    "\t\t} else {\n" +
                    "            return runMonoDex();\n" +
                    "        }\n" +
                    "\t}\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "`args.multiDex` 灏辨槸鏄惁鍒嗗寘鐨勫弬鏁帮紝閭ｄ箞闂鎵剧潃浜嗭紝濡傛灉涓嶉€夋嫨鍒嗗寘鐨勬儏鍐典笅锛屽紩鐢ㄦ柟娉曟暟瓒呰繃浜?65536 鐨勮瘽灏变細鎶涘嚭寮傚父銆俓n" +
                    "\n" +
                    "鍚屾牱鍒嗘瀽绗簩绉嶆儏鍐碉紝鏍规嵁閿欒淇℃伅鍙互鍏蜂綋瀹氫綅鍒颁唬鐮侊紝浣嗘槸寰堝鎬殑鏄?`DexMerger` 锛屾垜浠病鏈夎缃垎鍖呭弬鏁版垨鑰呭叾浠栧弬鏁帮紝涓轰粈涔堜細鏈?`DexMerger` 锛岃€屼笖渚濊禆宸ョ▼鏈€缁堜笉閮芥槸 aar 鏍煎紡鐨勫悧锛熼偅鎴戜滑杩樻槸鏉ヨ窡涓€璺熶唬鐮佸惂銆俓n" +
                    "\n" +
                    "```\n" +
                    "public class Main {\n" +
                    "\tprivate static byte[] mergeLibraryDexBuffers(byte[] outArray) throws IOException {\n" +
                    "        ArrayList<Dex> dexes = new ArrayList<Dex>();\n" +
                    "        if (outArray != null) {\n" +
                    "            dexes.add(new Dex(outArray));\n" +
                    "        }\n" +
                    "        for (byte[] libraryDex : libraryDexBuffers) {\n" +
                    "            dexes.add(new Dex(libraryDex));\n" +
                    "        }\n" +
                    "        if (dexes.isEmpty()) {\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "        Dex merged = new DexMerger(dexes.toArray(new Dex[dexes.size()]), CollisionPolicy.FAIL).merge();\n" +
                    "        return merged.getBytes();\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "杩欓噷鍙互鐪嬪埌鍙橀噺 `libraryDexBuffers` 锛屾槸涓€涓?List 闆嗗悎锛岄偅涔堟垜浠湅涓€涓嬭繖涓泦鍚堝湪鍝噷娣诲姞鏁版嵁鐨勶細\n" +
                    "\n" +
                    "```\n" +
                    "public class Main {\n" +
                    "\tprivate static boolean processFileBytes(String name, long lastModified, byte[] bytes) {\n" +
                    "  \t\tboolean isClassesDex = name.equals(DexFormat.DEX_IN_JAR_NAME);\n" +
                    "      \t//blablabla...\n" +
                    "        } else if (isClassesDex) {\n" +
                    "            synchronized (libraryDexBuffers) {\n" +
                    "                libraryDexBuffers.add(bytes);\n" +
                    "            }\n" +
                    "            return true;\n" +
                    "        } else {\n" +
                    "      \t//blablabla...\n" +
                    "\t}\n" +
                    "  \t//璋冪敤processFileBytes鐨勫湴鏂筡n" +
                    "  \tprivate static class FileBytesConsumer implements ClassPathOpener.Consumer {\n" +
                    "\n" +
                    "        @Override\n" +
                    "        public boolean processFileBytes(String name, long lastModified,\n" +
                    "                byte[] bytes)   {\n" +
                    "            return Main.processFileBytes(name, lastModified, bytes);\n" +
                    "        }\n" +
                    "      \t//blablabla...\n" +
                    "    }\n" +
                    "  \t//璋冪敤FileBytesConsumer鐨勫湴鏂筡n" +
                    "  \tprivate static void processOne(String pathname, FileNameFilter filter) {\n" +
                    "        ClassPathOpener opener;\n" +
                    "\n" +
                    "        opener = new ClassPathOpener(pathname, true, filter, new FileBytesConsumer());\n" +
                    "\n" +
                    "        if (opener.process()) {\n" +
                    "          updateStatus(true);\n" +
                    "        }\n" +
                    "    }\n" +
                    "  \t//璋冪敤processOne鐨勫湴鏂筡n" +
                    "  \tprivate static boolean processAllFiles() {\n" +
                    "      \t//blablabla...\n" +
                    "  \t\t// forced in main dex\n" +
                    "        for (int i = 0; i < fileNames.length; i++) {\n" +
                    "\t\t\tprocessOne(fileNames[i], mainPassFilter);\n" +
                    "\t\t}\n" +
                    "      \t//blablabla...\n" +
                    "\t}\n" +
                    "  \t//璋冪敤processAllFiles鐨勫湴鏂筡n" +
                    "  \tprivate static int runMonoDex() throws IOException {\n" +
                    "      \t//blablabla...\n" +
                    "  \t\tif (!processAllFiles()) {\n" +
                    "            return 1;\n" +
                    "        }\n" +
                    "      \t//blablabla...\n" +
                    "\t}\n" +
                    "\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "璺熶簡涓€鍦堝張璺熷洖鏉ヤ簡锛屼絾鏄敞鎰忎竴涓彉閲忥細`fileNames[i]`锛屼紶杩涘幓杩欎釜鍙橀噺锛屾槸涓湴鍧€锛屾渶缁堝湪 `processFileBytes` 涓鐞嗗悗娣诲姞鍒?`libraryDexBuffers` 涓紝閭ｈ窡涓€涓嬭繖涓彉閲忥細\n" +
                    "\n" +
                    "```\n" +
                    "public class Main {\n" +
                    "  \tprivate static boolean processAllFiles() {\n" +
                    "      \t//blablabla...\n" +
                    "  \t\tString[] fileNames = args.fileNames;\n" +
                    "      \t//blablabla...\n" +
                    "\t}\n" +
                    "  \tpublic void parse(String[] args) {\n" +
                    "      \t//blablabla...\n" +
                    "    \t}else if(parser.isArg(INPUT_LIST_OPTION + \"=\")) {\n" +
                    "\t\t\tFile inputListFile = new File(parser.getLastValue());\n" +
                    "\t\t\ttry{\n" +
                    "\t\t\t\tinputList = new ArrayList<String>();\n" +
                    "                readPathsFromFile(inputListFile.getAbsolutePath(), inputList);\n" +
                    "            } catch(IOException e) {\n" +
                    "\t\t\t\tSystem.err.println(\"Unable to read input list file: \" + inputListFile.getName());\n" +
                    "\t\t\t\tthrow new UsageException();\n" +
                    "            }\n" +
                    "        } else {\n" +
                    "      \t//blablabla...\n" +
                    "  \t\tfileNames = parser.getRemaining();\n" +
                    "\t\tif(inputList != null && !inputList.isEmpty()) {\n" +
                    "            inputList.addAll(Arrays.asList(fileNames));\n" +
                    "            fileNames = inputList.toArray(new String[inputList.size()]);\n" +
                    "        }\n" +
                    "\t}\n" +
                    "  \t\n" +
                    "  \tpublic static void main(String[] argArray) throws IOException {\n" +
                    "        Arguments arguments = new Arguments();\n" +
                    "        arguments.parse(argArray);\n" +
                    "\n" +
                    "        int result = run(arguments);\n" +
                    "        if (result != 0) {\n" +
                    "            System.exit(result);\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "璺熷埌杩欓噷鍙戠幇鏄紶杩涙潵鐨勫弬鏁帮紝閭ｆ垜浠啀鐪嬬湅 gradle 閲岄潰浼犵殑鏄粈涔堝弬鏁板惂锛屾煡鐪?[Dex](https://github.com/yydcdut/android_tools_base/blob/mm/build-system/gradle-core/src/main/groovy/com/android/build/gradle/tasks/Dex.groovy) task :\n" +
                    "\n" +
                    "```\n" +
                    "public class Dex extends BaseTask {\n" +
                    "  \t@InputFiles\n" +
                    "    Collection<File> libraries\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鎴戜滑鎶婅繖涓弬鏁版墦鍗板嚭鏉ワ細\n" +
                    "\n" +
                    "```\n" +
                    "afterEvaluate {\n" +
                    "    tasks.matching {\n" +
                    "        it.name.startsWith('dex')\n" +
                    "    }.each { dx ->\n" +
                    "        if (dx.additionalParameters == null) {\n" +
                    "            dx.additionalParameters = []\n" +
                    "        }\n" +
                    "        println dx.libraries\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鎵撳嵃鍑烘潵鍙戠幇鏄?`build/intermediates/pre-dexed/` 鐩綍閲岄潰鐨?jar 鏂囦欢锛屽啀鎶?jar 鏂囦欢瑙ｅ帇鍙戠幇閲岄潰灏辨槸 dex 鏂囦欢浜嗐€傛墍浠?`DexMerger` 鐨勫伐浣滃氨鏄悎骞惰繖閲岀殑 dex 銆俓n" +
                    "\n" +
                    "#### 鏇存敼缂栬瘧鐜\n" +
                    "\n" +
                    "```\n" +
                    "buildscript {\n" +
                    "\t//...\n" +
                    "    dependencies {\n" +
                    "        classpath 'com.android.tools.build:gradle:2.1.0-alpha3'\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "灏?gradle 璁剧疆涓?2.1.0-alpha3 涔嬪悗锛屽湪椤圭洰鐨?`build.gradle` 涓嵆浣挎病鏈夎缃?` multiDexEnabled true` 涔熻兘澶熺紪璇戦€氳繃锛屼絾鏄敓鎴愮殑 apk 鍖呬緷鏃ф槸涓や釜 dex 锛屾垜鎯崇殑鏄彲鑳戒负浜嗚缃?`instantRun` 銆俓n" +
                    "\n" +
                    "#### 瑙ｅ喅 65536\n" +
                    "\n" +
                    "Google MultiDex 瑙ｅ喅鏂规锛歕n" +
                    "\n" +
                    "鍦?gradle 涓坊鍔?`MultiDex` 鐨勪緷璧栵細\n" +
                    "\n" +
                    "```\n" +
                    "dependencies { compile 'com.android.support:MultiDex:1.0.0' }\n" +
                    "```\n" +
                    "\n" +
                    "鍦?gradle 涓厤缃?`MultiDexEnable` :\n" +
                    "\n" +
                    "```\n" +
                    "android {\n" +
                    "\tbuildToolsVersion \"21.1.0\"\n" +
                    "\tdefaultConfig {\n" +
                    "        // Enabling MultiDex support.\n" +
                    "        MultiDexEnabled true\n" +
                    "  }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鍦?AndroidManifest.xml 鐨?application 涓０鏄?\n" +
                    "\n" +
                    "```\n" +
                    "<application\n" +
                    "  android:name=\"androidx.multidex.MultiDexApplication\">\n" +
                    "<application/>\n" +
                    "```\n" +
                    "\n" +
                    "濡傛灉鏈夎嚜宸辩殑 Application 浜嗭紝璁╁叾缁ф壙浜?MultiDexApplication 銆俓n" +
                    "\n" +
                    "濡傛灉缁ф壙浜嗗叾浠栫殑 Application 锛岄偅涔堝彲浠ラ噸鍐?`attachBaseContext(Context)`:\n" +
                    "\n" +
                    "```\n" +
                    "@Override \n" +
                    "protected void attachBaseContext(Context base) {\n" +
                    "    super.attachBaseContext(base);\n" +
                    "    MultiDex.install(this);\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "### LinearAlloc\n" +
                    "\n" +
                    "> ERROR/dalvikvm(4620): LinearAlloc exceeded capacity (5242880), last=...\n" +
                    "\n" +
                    "#### LinearAlloc 鏄粈涔圽n" +
                    "\n" +
                    "LinearAlloc 涓昏鐢ㄦ潵绠＄悊 Dalvik 涓?class 鍔犺浇鏃剁殑鍐呭瓨锛屽氨鏄 App 鍦ㄦ墽琛屾椂鍑忓皯绯荤粺鍐呭瓨鐨勫崰鐢ㄣ€傚湪 App 鐨勫畨瑁呰繃绋嬩腑锛岀郴缁熶細杩愯涓€涓悕涓?dexopt 鐨勭▼搴忎负璇ュ簲鐢ㄥ湪褰撳墠鏈哄瀷涓繍琛屽仛鍑嗗銆俤exopt 浣跨敤 LinearAlloc 鏉ュ瓨鍌ㄥ簲鐢ㄧ殑鏂规硶淇℃伅銆侫pp 鍦ㄦ墽琛屽墠浼氬皢 class 璇昏繘 LinearAlloc 杩欎釜 buffer 涓紝杩欎釜 LinearAlloc 鍦?Android 2.3 涔嬪墠鏄?4M 鎴?5M 锛屽埌 4.0 涔嬪悗鍙樹负 8M 鎴?16M銆傚洜涓?5M 瀹炲湪鏄お灏忎簡锛屽彲鑳借繕娌℃湁 65536 灏卞凡缁忚秴杩?5M 浜嗭紝浠€涔堟剰鎬濆憿锛屽氨鏄彧鏈変竴涓寘鐨勬儏鍐典笅涔熸湁鍙兘鍑虹幇 INSTALL_FAILED_DEXOPT 锛屽師鍥犲氨鍦ㄤ簬 LinearAlloc銆俓n" +
                    "\n" +
                    "#### 瑙ｅ喅 LinearAlloc\n" +
                    "\n" +
                    "gradle锛歕n" +
                    "\n" +
                    "```\n" +
                    "afterEvaluate { \n" +
                    "  tasks.matching { \n" +
                    "    it.name.startsWith('dex') \n" +
                    "  }.each { dx -> \n" +
                    "    if (dx.additionalParameters == null) { \n" +
                    "      dx.additionalParameters = []\n" +
                    "    }  \n" +
                    "    dx.additionalParameters += '--set-max-idx-number=48000' \n" +
                    "  } \n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "`--set-max-idx-number=` 鐢ㄤ簬鎺у埗姣忎竴涓?dex 鐨勬渶澶ф柟娉曚釜鏁般€俓n" +
                    "\n" +
                    "杩欎釜鍙傛暟鍦ㄦ煡鐪?dx.jar 鎵惧埌锛歕n" +
                    "\n" +
                    "```\n" +
                    "//blablabla...\n" +
                    "} else if (parser.isArg(\"--set-max-idx-number=\")) { // undocumented test option\n" +
                    "  maxNumberOfIdxPerDex = Integer.parseInt(parser.getLastValue());\n" +
                    "} else if(parser.isArg(INPUT_LIST_OPTION + \"=\")) {\n" +
                    "//blablabla...\n" +
                    "```\n" +
                    "\n" +
                    "鏇村缁嗚妭鍙互鏌ョ湅婧愮爜锛歔Github -- platform_dalvik/Main](https://github.com/yydcdut/platform_dalvik/blob/master/dx/src/com/android/dx/command/dexer/Main.java)\n" +
                    "\n" +
                    "FB 鐨勫伐绋嬪笀浠浘缁忚繕鎯冲埌杩囩洿鎺ヤ慨鏀?LinearAlloc 鐨刓b澶у皬锛屾瘮濡備粠 5M 淇敼鍒?8M锛?[Under the Hood: Dalvik patch for Facebook for Android](https://www.facebook.com/notes/facebook-engineering/under-the-hood-dalvik-patch-for-facebook-for-android/10151345597798920) 銆俓n" +
                    "\n" +
                    "## dexopt && dex2oat\n" +
                    "\n" +
                    "![dexopt_dex2oat](http://7xs03u.com1.z0.glb.clouddn.com/dex_dexopt_dex2oat.png)\n" +
                    "\n" +
                    "### dexopt\n" +
                    "\n" +
                    "褰?Android 绯荤粺瀹夎涓€涓簲鐢ㄧ殑鏃跺€欙紝鏈変竴姝ユ槸瀵?Dex 杩涜浼樺寲锛岃繖涓繃绋嬫湁涓€涓笓闂ㄧ殑宸ュ叿鏉ュ鐞嗭紝鍙?DexOpt銆侱exOpt 鏄湪绗竴娆″姞杞?Dex 鏂囦欢鐨勬椂鍊欐墽琛岀殑锛屽皢 dex 鐨勪緷璧栧簱鏂囦欢鍜屼竴浜涜緟鍔╂暟鎹墦鍖呮垚 odex 鏂囦欢锛屽嵆 Optimised Dex锛屽瓨鏀惧湪 cache/dalvik_cache 鐩綍涓嬨€備繚瀛樻牸寮忎负 `apk璺緞 @ apk鍚?@ classes.dex` 銆傛墽琛?ODEX 鐨勬晥鐜囦細姣旂洿鎺ユ墽琛?Dex 鏂囦欢鐨勬晥鐜囪楂樺緢澶氥€俓n" +
                    "\n" +
                    "鏇村鍙煡鐪?[Dalvik Optimization and Verification With *dexopt*](http://www.netmite.com/android/mydroid/dalvik/docs/dexopt.html) 銆俓n" +
                    "\n" +
                    "### dex2oat\n" +
                    "\n" +
                    "Android Runtime 鐨?dex2oat 鏄皢 dex 鏂囦欢缂栬瘧鎴?oat 鏂囦欢銆傝€?oat 鏂囦欢鏄?elf 鏂囦欢锛屾槸鍙互鍦ㄦ湰鍦版墽琛岀殑鏂囦欢锛岃€?Android Runtime 鏇挎崲鎺変簡铏氭嫙鏈鸿鍙栫殑瀛楄妭鐮佽浆鑰岀敤鏈湴鍙墽琛屼唬鐮侊紝杩欏氨琚彨鍋?AOT(ahead-of-time)銆俤ex2oat 瀵规墍鏈?apk 杩涜缂栬瘧骞朵繚瀛樺湪 dalvik-cache 鐩綍閲屻€侾ackageManagerService 浼氭寔缁壂鎻忓畨瑁呯洰褰曪紝濡傛灉鏈夋柊鐨?App 瀹夎鍒欓┈涓婅皟鐢?dex2oat 杩涜缂栬瘧銆俓n" +
                    "\n" +
                    "鏇村鍙煡鐪? [Android杩愯鏃禔RT绠€瑕佷粙缁嶅拰瀛︿範璁″垝](http://blog.csdn.net/luoshengyang/article/details/39256813) 銆俓n" +
                    "\n" +
                    "## NoClassDefFoundError\n" +
                    "\n" +
                    "鐜板湪 INSTALL_FAILED_DEXOPT 闂鏄В鍐充簡锛屼絾鏄湁鏃跺€欑紪璇戝畬杩愯鐨勬椂鍊欎竴鎵撳紑 App 灏?crash 浜嗭紝鏌ョ湅 log 鍙戠幇鏄煇涓被鎵句笉鍒板紩鐢ㄣ€俓n" +
                    "\n" +
                    "### Build Tool 鏄浣曞垎鍖呯殑\n" +
                    "\n" +
                    "涓轰粈涔堜細杩欐牱鍛紵鏄洜涓?build-tool 鍦ㄥ垎鍖呯殑鏃跺€欏彧鍒ゆ柇浜嗙洿鎺ュ紩鐢ㄧ被銆備粈涔堟槸鐩存帴寮曠敤绫诲憿锛熶妇涓牀瀛愶細\n" +
                    "\n" +
                    "```\n" +
                    "public class MainActivity extends Activity {\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        DirectReferenceClass test = new DirectReferenceClass();\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "public class DirectReferenceClass {\n" +
                    "    public DirectReferenceClass() {\n" +
                    "        InDirectReferenceClass test = new InDirectReferenceClass();\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "public class InDirectReferenceClass {\n" +
                    "    public InDirectReferenceClass() {\n" +
                    "\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "涓婇潰鏈?MainActivity銆丏irectReferenceClass 銆両nDirectReferenceClass 涓変釜绫伙紝鍏朵腑 DirectReferenceClass 鏄?MainActivity 鐨勭洿鎺ュ紩鐢ㄧ被锛孖nDirectReferenceClass 鏄?DirectReferenceClass 鐨勭洿鎺ュ紩鐢ㄧ被銆傝€?InDirectReferenceClass 鏄?MainActivity 鐨勯棿鎺ュ紩鐢ㄧ被(鍗崇洿鎺ュ紩鐢ㄧ被鐨勬墍鏈夌洿鎺ュ紩鐢ㄧ被)銆俓n" +
                    "\n" +
                    "濡傛灉鎴戜滑浠ｇ爜鏄繖鏍峰啓鐨勶細\n" +
                    "\n" +
                    "```\n" +
                    "public class HelloMultiDexApplication extends Application {\n" +
                    "    @Override\n" +
                    "    protected void attachBaseContext(Context base) {\n" +
                    "        super.attachBaseContext(base);\n" +
                    "        DirectReferenceClass test = new DirectReferenceClass();\n" +
                    "        MultiDex.install(this);\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "杩欐牱鐩存帴灏?crash 浜嗐€傚悓鐞嗚繕瑕佸崟渚嬫ā寮忎腑鎷垮埌鍗曚緥涔嬪悗鐩存帴璋冪敤鏌愪釜鏂规硶杩斿洖鐨勬槸鍙﹀涓€涓璞★紝骞堕潪鍗曚緥瀵硅薄銆俓n" +
                    "\n" +
                    "build tool 鐨勫垎鍖呮搷浣滃彲浠ユ煡鐪?sdk 涓?build-tools 鏂囦欢澶逛笅鐨?`mainDexClasses` 鑴氭湰锛屽悓鏃惰繕鍙戠幇浜?`mainDexClasses.rules` 鏂囦欢锛岃鏂囦欢鏄富 dex 鐨勫尮閰嶈鍒欍€傝鑴氭湰瑕佹眰杈撳叆涓€涓枃浠剁粍锛堝寘鍚紪璇戝悗鐨勭洰褰曟垨jar鍖咃級锛岀劧鍚庡垎鏋愭枃浠剁粍涓殑绫诲苟鍐欏叆鍒扳€搊utput鎵€鎸囧畾鐨勬枃浠朵腑銆傚疄鐜板師鐞嗕篃涓嶅鏉傦紝涓昏鍒嗕负涓夋锛歕n" +
                    "\n" +
                    "1. 鐜妫€鏌ワ紝鍖呮嫭浼犲叆鍙傛暟鍚堟硶鎬ф鏌ワ紝璺緞妫€鏌ヤ互鍙妏roguard鐜妫€娴嬬瓑銆俓n" +
                    "2. 浣跨敤mainDexClasses.rules瑙勫垯锛岄€氳繃Proguard鐨剆hrink鍔熻兘锛岃鍓棤鍏崇被锛岀敓鎴愪竴涓猼mp.jar鍖呫€俓n" +
                    "3. 閫氳繃鐢熸垚鐨則mp jar鍖咃紝璋冪敤MainDexListBuilder绫荤敓鎴愪富dex鐨勬枃浠跺垪琛ㄣ€俓n" +
                    "\n" +
                    "鏇村缁嗚妭鍙互鏌ョ湅婧愮爜锛歔Github -- platform_dalvik/MainDexListBuilder](https://github.com/yydcdut/platform_dalvik/blob/0be69b5268823139b04411f6a8e15cb58f54ddae/dx/src/com/android/multidex/MainDexListBuilder.java)\n" +
                    "\n" +
                    "### Gradle 鎵撳寘娴佺▼涓槸濡備綍鍒嗗寘鐨刓n" +
                    "\n" +
                    "鍦ㄩ」鐩腑锛屽彲浠ョ洿鎺ヨ繍琛?gradle 鐨?task 銆俓n" +
                    "\n" +
                    "*  `collect{flavor}{buildType}MultiDexComponents` Task 銆傝繖涓?task 鏄幏鍙?AndroidManifest.xml 涓?Application 銆丄ctivity 銆丼ervice 銆?Receiver 銆?Provider 绛夌浉鍏崇被锛屼互鍙?Annotation 锛屼箣鍚庡皢鍐呭鍐欏埌 `build/intermediates/multi-dex/{flavor}/{buildType}/maindexlist.txt` 鏂囦欢涓幓銆俓n" +
                    "\n" +
                    "\n" +
                    "* `packageAll{flavor}DebugClassesForMultiDex` Task 銆傝 task 鏄皢鎵€鏈夌被鎵撳寘鎴?jar 鏂囦欢瀛樺湪 `build/intermediates/multi-dex/{flavor}/debug/allclasses.jar` 銆?褰?BuildType 涓?Release 鐨勬椂鍊欙紝鎵ц鐨勬槸 `proguard{flavor}Release` Task锛岃 task 灏?proguard 娣锋穯鍚庣殑绫绘墦鍖呮垚 jar 鏂囦欢瀛樺湪 `build/intermediates/classes-proguard/{flavor}/release/classes.jar`\n" +
                    "* `shrink{flavor}{buildType}MultiDexComponents` Task 銆傝 task 浼氭牴鎹?maindexlist.txt 鐢熸垚  componentClasses.jar 锛岃 jar 鍖呴噷闈㈠氨鍙湁 maindexlist.txt 閲岄潰鐨勭被锛岃 jar 鍖呯殑浣嶇疆鍦?`build/intermediates/multi-dex/{flavor}/{buildType}/componentClasses.jar`\n" +
                    "* `create{flavor}{buildType}MainDexClassList` Task 銆傝 task 浼氭牴鎹敓鎴愮殑 componentClasses.jar 鍘绘壘杩欓噷闈㈢殑鎵€鏈夌殑 class 涓洿鎺ヤ緷璧栫殑 class 锛岀劧鍚庡皢鍐呭鍐欏埌 `build/intermediates/multi-dex/{flavor}/{buildType}/maindexlist.txt` 涓€傛渶缁堣繖涓枃浠堕噷闈㈠垪鍑烘潵鐨勭被閮戒細琚垎閰嶅埌绗竴涓?dex 閲岄潰銆俓n" +
                    "\n" +
                    "鏇村缁嗚妭鍙互鏌ョ湅婧愮爜锛歔Github -- android_tools_base](https://github.com/yydcdut/android_tools_base/blob/mm/build-system/gradle-core/src/main/groovy/com/android/build/gradle/internal/tasks/multidex/CreateManifestKeepList.groovy) 銆俓n" +
                    "\n" +
                    "### 瑙ｅ喅 NoClassDefFoundError\n" +
                    "\n" +
                    "gradle :\n" +
                    "\n" +
                    "```\n" +
                    "afterEvaluate { \n" +
                    "  tasks.matching { \n" +
                    "    it.name.startsWith('dex') \n" +
                    "  }.each { dx -> \n" +
                    "    if (dx.additionalParameters == null) { \n" +
                    "      dx.additionalParameters = []\n" +
                    "    }  \n" +
                    "    dx.additionalParameters += '--set-max-idx-number=48000' \n" +
                    "    dx.additionalParameters += \"--main-dex-list=$projectDir/multidex.keep\".toString()\n" +
                    "  } \n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "`--main-dex-list=` 鍙傛暟鏄竴涓被鍒楄〃鐨勬枃浠讹紝鍦ㄨ鏂囦欢涓殑绫讳細琚墦鍖呭湪绗竴涓?dex 涓€俓n" +
                    "\n" +
                    "multidex.keep 閲岄潰鍒椾笂闇€瑕佹墦鍖呭埌绗竴涓?dex 鐨?class 鏂囦欢锛屾敞鎰忥紝濡傛灉闇€瑕佹贩娣嗙殑璇濋渶瑕佸啓娣锋穯涔嬪悗鐨?class 銆俓n" +
                    "\n" +
                    "## Application Not Responding\n" +
                    "\n" +
                    "鍥犱负绗竴娆¤繍琛岋紙鍖呮嫭娓呴櫎鏁版嵁涔嬪悗锛夌殑鏃跺€欓渶瑕?dexopt 锛岀劧鑰?dexopt 鏄竴涓瘮杈冭€楁椂鐨勬搷浣滐紝鍚屾椂 `MultiDex.install()` 鎿嶄綔鏄湪 `Application.attachBaseContext()` 涓繘琛岀殑锛屽崰鐢ㄧ殑鏄疷I绾跨▼銆傞偅涔堥棶棰樻潵浜嗭紝褰撴垜鐨勭浜屼釜鍖呫€佺涓変釜鍖呭緢澶х殑鏃跺€欙紝绋嬪簭灏遍樆濉炲湪 `MultiDex.install()` 杩欎釜鍦版柟浜嗭紝涓€鏃﹁秴杩囪瀹氭椂闂达紝閭ｅ氨 ANR 浜嗐€傞偅鎬庝箞鍔烇紵鏀惧瓙绾跨▼锛熷鏋?Application 鏈変竴浜涘垵濮嬪寲鎿嶄綔锛屽埌鍒濆鍖栨搷浣滅殑鍦版柟鐨勬椂鍊欓兘杩樻病鏈夊畬鎴?install + dexopt 鐨勮瘽锛岄偅涓嶆槸鍙?NoClassDefFoundError 浜嗗悧锛熷悓鏃?ClassLoader 鏀惧湪鍝釜绾跨▼閮借涓荤嚎绋嬫寕璧枫€傚ソ浜嗭紝閭ｅ湪 multidex.keep 鐨勫姞涓婄浉鍏崇殑鎵€鏈夌殑绫诲惂銆傚ソ鍍忚繖鏍锋垚浜嗭紝浣嗘槸绗竴涓?dex 鍙堝ぇ璧锋潵浜嗭紝鑰屼笖濡傛灉鐢ㄦ埛鎿嶄綔蹇紝杩樻病瀹屾垚 install + dexopt 浣嗘槸宸茬粡鎶?App 鎵€浠ョ晫闈b閮芥墦寮€浜嗕竴閬嶃€傘€傘€傝櫧鐒惰繖涓嶇幇瀹炪€傘€俓n" +
                    "\n" +
                    "### 寰俊鍔犺浇鏂规\n" +
                    "\n" +
                    "棣栨鍔犺浇鍦ㄥ湴鐞冧腑椤典腑, 骞剁敤绾跨▼鍘诲姞杞斤紙浣嗘槸 5.0 涔嬪墠鍔犺浇 dex 鏃惰繕鏄細鎸傝捣涓荤嚎绋嬩竴娈垫椂闂达紙涓嶆槸鍏ㄧ▼閮芥寕璧凤級锛夈€俓n" +
                    "\n" +
                    "* dex 褰㈠紡\n" +
                    "\n" +
                    "  寰俊鏄皢鍖呮斁鍦?`assets` 鐩綍涓嬬殑锛屽湪鍔犺浇 Dex 鐨勪唬鐮佹椂锛屽疄闄呬笂浼犺繘鍘荤殑鏄?zip锛屽湪鍔犺浇鍓嶉渶瑕侀獙璇?MD5锛岀‘淇濇墍鍔犺浇鐨?Dex 娌℃湁琚鏀广€俓n" +
                    "\n" +
                    "* dex 绫诲垎鍖呰鍒橽n" +
                    "\n" +
                    "  鍒嗗寘瑙勫垯鍗冲皢鎵€鏈?Application銆丆ontentProvider 浠ュ強鎵€鏈?export 鐨?Activity銆丼ervice 銆丷eceiver 鐨勯棿鎺ヤ緷璧栭泦閮藉繀椤绘斁鍦ㄤ富 dex銆俓n" +
                    "\n" +
                    "* 鍔犺浇 dex 鐨勬柟寮廫n" +
                    "\n" +
                    "  鍔犺浇閫昏緫杩欒竟涓昏鍒ゆ柇鏄惁宸茬粡 dexopt锛岃嫢宸茬粡 dexopt锛屽嵆鏀惧湪 attachBaseContext 鍔犺浇锛屽弽涔嬫斁浜庡湴鐞冧腑鐢ㄧ嚎绋嬪姞杞姐€傛€庝箞鍒ゆ柇锛熷洜涓哄湪寰俊涓紝鑻ュ垽鏂?revision 鏀瑰彉锛屽嵆灏?dex 浠ュ強 dexopt 鐩綍娓呯┖銆傚彧闇€绠€鍗曞垽鏂袱涓洰褰?dex 鍚嶇О銆佹暟閲忔槸鍚︿笌閰嶇疆鏂囦欢鐨勪竴鑷淬€俓n" +
                    "\n" +
                    "鎬荤殑鏉ヨ锛岃繖绉嶆柟妗堢敤鎴蜂綋楠岃緝濂斤紝缂虹偣鍦ㄤ簬澶繃澶嶆潅锛屾瘡娆￠兘闇€閲嶆柊鎵弿渚濊禆闆嗭紝鑰屼笖浣跨敤鐨勬槸姣旇緝澶х殑闂存帴渚濊禆闆嗐€俓n" +
                    "\n" +
                    "### Facebook 鍔犺浇鏂规\n" +
                    "\n" +
                    "Facebook鐨勬€濊矾鏄皢 `Multi\bDex.install()` 鎿嶄綔鏀惧湪鍙﹀涓€涓粡甯歌繘琛岀殑銆俓n" +
                    "\n" +
                    "* dex 褰㈠紡\n" +
                    "\n" +
                    "  涓庡井淇＄浉鍚屻€俓n" +
                    "\n" +
                    "* dex 绫诲垎鍖呰鍒橽n" +
                    "\n" +
                    "  Facebook 灏嗗姞杞?dex 鐨勯€昏緫鍗曠嫭鏀句簬涓€涓崟鐙殑 nodex 杩涚▼涓€俓n" +
                    "\n" +
                    "```\n" +
                    "  <activity \n" +
                    "  android:exported=\"false\"\n" +
                    "  android:process=\":nodex\"\n" +
                    "      android:name=\"com.facebook.nodex.startup.splashscreen.NodexSplashActivity\">\n" +
                    "```\n" +
                    "\n" +
                    "  鎵€鏈夌殑渚濊禆闆嗕负 Application銆丯odexSplashActivity 鐨勯棿鎺ヤ緷璧栭泦鍗冲彲銆俓n" +
                    "\n" +
                    "* 鍔犺浇 dex 鐨勬柟寮廫n" +
                    "\n" +
                    "  鍥犱负 `NodexSplashActivity` 鐨?intent-filter 鎸囧畾涓?`Main` 鍜?`LAUNCHER` 锛屾墍浠ヤ竴鎵撳紑 App 棣栧厛鎷夎捣 nodex 杩涚▼锛岀劧鍚庢墦寮€ `NodexSplashActivity` 杩涜 `MultiDex.install()` 銆傚鏋滃凡缁忚繘琛屼簡 dexpot 鎿嶄綔鐨勮瘽灏辩洿鎺ヨ烦杞富鐣岄潰锛屾病鏈夌殑璇濆氨绛夊緟 dexpot 鎿嶄綔瀹屾垚鍐嶈烦杞富鐣岄潰銆俓n" +
                    "\n" +
                    "杩欑鏂瑰紡濂藉鍦ㄤ簬渚濊禆闆嗛潪甯哥畝鍗曪紝鍚屾椂棣栨鍔犺浇 dex 鏃朵篃涓嶄細鍗℃銆備絾鏄畠鐨勭己鐐逛篃寰堟槑鏄撅紝鍗虫瘡娆″惎鍔ㄤ富杩涚▼鏃讹紝閮介渶鍏堝惎鍔?nodex 杩涚▼銆傚敖绠?nodex 杩涚▼閫昏緫闈炲父绠€鍗曪紝杩欎篃闇€100ms浠ヤ笂銆俓n" +
                    "\n" +
                    "### 缇庡洟鍔犺浇鏂规\n" +
                    "\n" +
                    "* dex 褰㈠紡\n" +
                    "\n" +
                    "  鍦?gradle 鐢熸垚 dex 鏂囦欢鐨勮繖姝ヤ腑锛岃嚜瀹氫箟涓€涓?task 鏉ュ共棰?dex 鐨勭敓浜ц繃绋嬶紝浠庤€屼骇鐢熷涓?dex 銆俓n" +
                    "\n" +
                    "```\n" +
                    "  tasks.whenTaskAdded { task ->\n" +
                    "      if (task.name.startsWith('proguard') && (task.name.endsWith('Debug') || task.name.endsWith('Release'))) {\n" +
                    "          task.doLast {\n" +
                    "              makeDexFileAfterProguardJar();\n" +
                    "          }\n" +
                    "          task.doFirst {\n" +
                    "              delete \"${project.buildDir}/intermediates/classes-proguard\";\n" +
                    "\n" +
                    "              String flavor = task.name.substring('proguard'.length(), task.name.lastIndexOf(task.name.endsWith('Debug') ? \"Debug\" : \"Release\"));\n" +
                    "              generateMainIndexKeepList(flavor.toLowerCase());\n" +
                    "          }\n" +
                    "      } else if (task.name.startsWith('zipalign') && (task.name.endsWith('Debug') || task.name.endsWith('Release'))) {\n" +
                    "          task.doFirst {\n" +
                    "              ensureMultiDexInApk();\n" +
                    "          }\n" +
                    "      }\n" +
                    "  }\n" +
                    "```\n" +
                    "\n" +
                    "* dex 绫诲垎鍖呰鍒橽n" +
                    "\n" +
                    "  鎶?Service銆丷eceiver銆丳rovider 娑夊強鍒扮殑浠ｇ爜閮芥斁鍒颁富 dex 涓紝鑰屾妸 Activity 娑夊強鍒扮殑浠ｇ爜杩涜浜嗕竴瀹氱殑鎷嗗垎锛屾妸棣栭〉 Activity銆丩aucher Activity 銆佹杩庨〉鐨?Activity 銆佸煄甯傚垪琛ㄩ〉 Activity 绛夋墍渚濊禆鐨?class 鏀惧埌浜嗕富 dex 涓紝鎶婁簩绾с€佷笁绾ч〉闈㈢殑 Activity 浠ュ強涓氬姟棰戦亾鐨勪唬鐮佹斁鍒颁簡绗簩涓? dex 涓紝涓轰簡鍑忓皯浜哄伐鍒嗘瀽 class 鐨勪緷璧栨墍甯︿簡鐨勪笉鍙淮鎶ゆ€у拰楂橀闄╂€э紝缇庡洟缂栧啓浜嗕竴涓兘澶熻嚜鍔ㄥ垎鏋?class 渚濊禆鐨勮剼鏈紝 浠庤€岃兘澶熶繚璇乗u001D涓?dex 鍖呭惈 class 浠ュ強浠栦滑鎵€渚濊禆鐨勬墍鏈?class 閮藉湪鍏跺唴锛岃繖鏍疯繖涓剼鏈氨浼氬湪鎵撳寘涔嬪墠鑷姩鍒嗘瀽鍑哄惎鍔ㄥ埌涓?dex 鎵€娑夊強鐨勬墍鏈変唬鐮侊紝淇濊瘉涓?dex 杩愯姝ｅ父銆俓n" +
                    "\n" +
                    "* 鍔犺浇 dex 鐨勬柟寮廫n" +
                    "\n" +
                    "  閫氳繃鍒嗘瀽 Activity 鐨勫惎鍔ㄨ繃绋嬶紝鍙戠幇 Activity 鏄敱 ActivityThread 閫氳繃 Instrumentation 鏉ュ惎鍔ㄧ殑锛岄偅涔堟槸鍚﹀彲浠ュ湪 Instrumentation 涓仛涓€瀹氱殑鎵嬭剼鍛紵閫氳繃鍒嗘瀽浠ｇ爜 ActivityThread 鍜?Instrumentation 鍙戠幇锛孖nstrumentation 鏈夊叧 Activity 鍚姩鐩稿叧鐨勬柟娉曞ぇ姒傛湁锛歟xecStartActivity銆?newActivity 绛夌瓑锛岃繖鏍峰氨鍙互鍦ㄨ繖浜涙柟娉曚腑娣诲姞浠ｇ爜閫昏緫杩涜鍒ゆ柇杩欎釜 class 鏄惁鍔犺浇浜嗭紝濡傛灉鍔犺浇鍒欑洿鎺ュ惎鍔ㄨ繖涓?Activity锛屽鏋滄病鏈夊姞杞藉畬鎴愬垯鍚姩涓€涓瓑寰呯殑 Activity 鏄剧ず缁欑敤鎴凤紝鐒跺悗鍦ㄨ繖涓?Activity 涓瓑寰呭悗鍙扮浜屼釜 dex 鍔犺浇瀹屾垚锛屽畬鎴愬悗鑷姩璺宠浆鍒扮敤鎴峰疄闄呰璺宠浆鐨?Activity锛涜繖鏍峰湪浠ｇ爜鍏呭垎瑙ｈ€﹀悎锛屼互鍙婃瘡涓笟鍔′唬鐮佽兘澶熷仛鍒伴绮掑寲鐨勫墠鎻愪笅锛屽氨鍋氬埌绗簩涓?dex 鐨勬寜闇€鍔犺浇浜嗐€俓n" +
                    "\n" +
                    "缇庡洟鐨勮繖绉嶆柟寮忓涓?dex 鐨勮姹傞潪甯搁珮锛屽洜涓虹浜屼釜 dex 鏄瓑鍒伴渶瑕佺殑鏃跺€欏啀鍘诲姞杞姐€傞噸鍐橧nstrumentation 鐨?execStartActivity 鏂规硶锛宧ook 璺宠浆 Activity 鐨勬€诲叆鍙ｅ仛鍒ゆ柇锛屽鏋滃綋鍓嶇浜屼釜 dex 杩樻病鏈夊姞杞藉畬鎴愶紝灏卞脊涓€涓?loading Activity绛夊緟鍔犺浇瀹屾垚銆俓n" +
                    "\n" +
                    "### \b缁煎悎鍔犺浇鏂规\n" +
                    "\n" +
                    "寰俊鐨勬柟妗堥渶瑕佸皢 dex 鏀句簬 `assets` 鐩綍涓嬶紝鍦ㄦ墦鍖呯殑鏃跺€欏お杩囪礋璐ｏ紱Facebook 鐨勬柟妗堟瘡娆¤繘鍏ラ兘鏄紑鍚竴涓?nodex 杩涚▼锛岃€屾垜浠笇鏈涜妭鐪佽祫婧愮殑鍚屾椂蹇€熸墦寮€ App锛涚編鍥㈢殑鏂规纭疄寰?hack锛屼絾鏄浜庨」鐩凡缁忓緢搴炲ぇ锛岃€﹀悎搴﹀張姣旇緝楂樼殑鎯呭喌涓嬪苟涓嶉€傚悎銆傛墍浠ヨ繖閲屽皾璇曠粨鍚堜笁涓柟妗堬紝閽堝鑷繁鐨勯」鐩潵杩涜浼樺寲銆俓n" +
                    "\n" +
                    "* dex 褰㈠紡\n" +
                    "\n" +
                    "  绗竴锛屼负浜嗚兘澶熺户缁敮鎸?Android 2.x 鐨勬満鍨嬶紝鎴戜滑灏嗘瘡涓寘鐨勬柟娉曟暟鎺у埗鍦?48000 涓紝杩欐牱鏈€鍚庡垎鍑烘潵 dex 鍖呭ぇ绾﹀湪 5M 宸﹀彸锛涚浜岋紝涓轰簡闃叉 NoClassDefFoundError 鐨勬儏鍐碉紝鎴戜滑鎵惧嚭鏉ュ惎鍔ㄩ〉銆佸紩瀵奸〉銆侀椤垫瘮杈冨湪鎰忕殑涓€浜涚被锛屾瘮濡?Fragment 绛夛紙鍥犱负鍦ㄧ敓鎴?maindexlist.txt 鐨勬椂鍊欏彧浼氭壘 Activity 鐨勭洿鎺ュ紩鐢紝姣斿棣栭〉 Activity 鐩存帴寮曠敤 AFragemnt锛屼絾鏄?AFragment 鐨勫紩鐢ㄥ苟娌℃湁鍘绘壘锛夈€俓n" +
                    "\n" +
                    "* dex 绫诲垎鍖呰鍒橽n" +
                    "\n" +
                    "  绗竴涓寘鏀?Application銆丄ndroid鍥涘ぇ缁勪欢浠ュ強鍚姩椤点€佸紩瀵奸〉銆侀椤电殑鐩存帴寮曠敤鐨?Fragment 鐨勫紩鐢ㄧ被锛岃繕鏀句簡鎺ㄩ€佹秷鎭繃鏉ョ偣鍑?Notification 涔嬪悗瑕佸睍绀虹殑 Activity 涓殑 Fragment 鐨勫紩鐢ㄧ被銆俓n" +
                    "\n" +
                    "  Fragment 鐨勫紩鐢ㄧ被鏄啓浜嗕竴涓剼鏈紝杈撳叆闇€瑕佹壘鐨勭被鐒跺悗灏嗚繖浜涘紩鐢ㄧ被鍐欏埌 multidex.keep 鏂囦欢涓紝濡傛灉鏄?debug 鐨勫氨鐩存帴鍦ㄧ敓鎴愮殑 jar 閲岄潰鎵撅紝濡傛灉鏄?release 鐨勮瘽灏遍€氳繃 mapping.txt 鎵撅紝鎵句笉鍒扮殑璇濆啀鍘?jar 閲岄潰鎵撅紝鎵€浠ュ湪 gradle 鎵撳寘鐨勮繃绋嬩腑鎴戜滑浜轰负骞叉壈涓€涓嬶細\n" +
                    "\n" +
                    "```\n" +
                    "  tasks.whenTaskAdded { task ->\n" +
                    "      if (task.name.startsWith(\"create\") && task.name.endsWith(\"MainDexClassList\")) {\n" +
                    "          task.doLast {\n" +
                    "              def flavorAndBuildType = task.name.substring(\"create\".length(), task.name.length() - \"MainDexClassList\".length())\n" +
                    "              autoSplitDex.configure {\n" +
                    "                  description = flavorAndBuildType\n" +
                    "              }\n" +
                    "              autoSplitDex.execute()\n" +
                    "          }\n" +
                    "      } \n" +
                    "  }\n" +
                    "```\n" +
                    "\n" +
                    "  璇︾粏浠ｇ爜鍙锛歔Github 鈥?PhotoNoter/gradle](https://github.com/yydcdut/PhotoNoter/blob/master/app/build.gradle)\n" +
                    "\n" +
                    "* 鍔犺浇 dex 鐨勬柟寮廫n" +
                    "\n" +
                    "  鍦ㄩ槻姝?ANR 鏂归潰锛屾垜浠噰鐢ㄤ簡 Facebook 鐨勬€濊矾銆備絾鏄◢寰湁涓€鐐瑰尯鍒紝宸埆鍦ㄤ簬鎴戜滑骞朵笉鍦ㄤ竴寮€鍚?App 鐨勬椂鍊欏氨鍘昏捣杩涚▼锛岃€屾槸涓€寮€鍚?App 鐨勬椂鍊欏湪涓昏繘绋嬮噷闈㈠垽鏂槸鍚?dexopt 杩囨病锛屾病鏈夌殑璇濆啀鍘昏捣鍙﹀鐨勮繘绋嬬殑 Activity 涓撻棬鍋?dexopt 鎿嶄綔 銆備竴鏃︽媺璧蜂簡鍘诲仛 dexopt 鐨勮繘绋嬶紝閭ｄ箞璁╀富杩涚▼杩涘叆涓€涓寰幆锛屼竴鐩寸瓑鍒?dexopt 杩涚▼缁撴潫鍐嶇粨鏉熸寰幆寰€涓嬭蛋銆傞偅涔堥棶棰樻潵浜嗭紝绗竴锛屼富杩涚▼杩涘叆姝诲惊鐜細 ANR 鍚楋紵绗簩锛屽浣曞垽鏂槸鍚?dexopt 杩囷紱绗笁锛屼负浜嗙晫闈㈠弸濂斤紝dexopt 鐨勮繘绋嬭鎬庝箞鍋氾紱绗洓锛屼富杩涚▼鎬庝箞鐭ラ亾 dexopt 杩涚▼缁撴潫浜嗭紝涔熷氨鏄€庝箞鍘诲仛杩涚▼闂撮€氫俊銆俓n" +
                    "\n" +
                    "  涓€涓竴涓棶棰樼殑瑙ｅ喅锛屽厛绗竴涓細鍥犱负褰撴媺璧?dexopt 杩涚▼涔嬪悗锛屾垜浠湪 dexopt 杩涚▼鐨?Activity 涓繘琛?`MultiDex.install()` 鎿嶄綔锛屾鏃朵富杩涚▼\b涓嶅啀鏄墠鍙拌繘绋嬩簡锛屾墍浠ヤ笉浼?ANR 銆俓n" +
                    "\n" +
                    "  绗簩涓棶棰橈細鍥犱负绗竴娆″惎鍔ㄦ槸浠€涔堟暟鎹兘娌℃湁鐨勶紝閭ｄ箞鎴戜滑灏卞缓绔嬩竴涓?`SharedPreference` 锛屽惎鍔ㄧ殑鏃跺€欏厛鍘讳粠杩欓噷鑾峰彇鏁版嵁锛屽鏋滄病鏈夋暟鎹偅涔堜篃灏辨槸娌℃湁 dexopt 杩囷紝濡傛灉鏈夋暟鎹偅涔堣偗瀹氭槸 dexopt 杩囩殑锛屼絾鏄繖涓?`SharedPreference` 鎴戜滑寰椾繚璇佹垜浠殑绋嬪簭鍙湁杩欎釜鍦版柟鍙互淇敼锛屽叾浠栧湴鏂逛笉鑳戒慨鏀广€俓n" +
                    "\n" +
                    "  绗笁涓棶棰橈細鍥犱负 App 鐨勫惎鍔ㄤ篃鏄竴寮犲浘鐗囷紝鎵€浠ュ湪 dexopt 鐨?Activity 鐨?layout 涓紝鎴戜滑灏辨妸杩欏紶鍥剧墖璁剧疆涓婂幓灏卞ソ浜嗭紝褰撳叧闂?dexopt 鐨?Activity 鐨勬椂鍊欙紝鎴戜滑寰楀叧闂?Activity 鐨勫姩鐢汇€傚悓鏃朵负浜嗕笉璁?dexopt 杩涚▼鍙戠敓 ANR 锛屾垜浠皢 `MultiDex.install()` 杩囩▼鏀惧湪浜嗗瓙绾跨▼涓繘琛屻€俓n" +
                    "\n" +
                    "  绗洓涓棶棰橈細Linux 鐨勮繘绋嬮棿閫氫俊鐨勬柟寮忔湁寰堝锛孉ndroid 涓繕鏈?Binder 绛夛紝閭ｄ箞鎴戜滑杩欓噷閲囩敤鍝鏂瑰紡姣旇緝濂藉憿锛熼鍏堟兂鍒扮殑鏄棦鐒?dexopt 杩涚▼缁撴潫浜嗚嚜鐒跺湪涓昏繘绋嬬殑姝诲惊鐜腑鍘诲垽鏂?dexopt 杩涚▼鏄惁瀛樺湪銆備絾鏄湪瀹為檯鎿嶄綔涓彂鐜帮紝dexopt 铏界劧宸茬粡閫€鍑轰簡锛屼絾鏄繘绋嬪苟娌℃湁椹笂琚洖鏀舵帀锛屾墍浠ヨ繖涓柟娉曡蛋涓嶉€氥€傞偅涔堢敤 Broadcast 骞挎挱鍙互鍚楋紵鍙槸鍙互锛屼絾鏄鍔犱簡 Application 鐨勮礋鎷咃紝鍦ㄦ媺璧?dexopt 杩涚▼鍓嶈繕寰楁敞鍐屼竴涓姩鎬佸箍鎾紝鎺ユ敹鍒板箍鎾箣鍚庤繕寰楁敞閿€鎺夛紝鎵€浠ヨ繖涓篃娌℃湁閲囩敤銆傞偅涔堟渶缁堥噰鐢ㄧ殑鏂瑰紡鏄垽鏂枃浠舵槸鍚﹀瓨鍦紝鍦ㄦ媺璧?dexopt 杩涚▼鍓嶅湪鏌愪釜瀹夊叏鐨勫湴鏂瑰缓绔嬩竴涓复鏃舵枃浠讹紝鐒跺悗姝诲惊鐜垽鏂繖涓枃浠舵槸鍚﹀瓨鍦紝鍦?dexopt 杩涚▼缁撴潫鐨勬椂鍊欏垹闄よ繖涓复鏃舵枃浠讹紝閭ｄ箞鍦ㄤ富杩涚▼鐨勬寰幆涓彂鐜版鏂囦欢涓嶅瓨鍦ㄤ簡锛屽氨鐩存帴璺冲嚭寰幆锛岀户缁?Application 鍒濆鍖栨搷浣溿€俓n" +
                    "\n" +
                    "```\n" +
                    "  public class NoteApplication extends Application {\n" +
                    "  @Override\n" +
                    "      protected void attachBaseContext(Context base) {\n" +
                    "          super.attachBaseContext(base);\n" +
                    "          //寮€鍚痙ex杩涚▼鐨勮瘽涔熶細杩涘叆application\n" +
                    "          if (isDexProcess()) {\n" +
                    "              return;\n" +
                    "          }\n" +
                    "          doInstallBeforeLollipop();\n" +
                    "          MultiDex.install(this);\n" +
                    "      }\n" +
                    "\n" +
                    "      @Override\n" +
                    "      public void onCreate() {\n" +
                    "          super.onCreate();\n" +
                    "          if (isDexProcess()) {\n" +
                    "              return;\n" +
                    "          }\n" +
                    "        //鍏朵粬鍒濆鍖朶n" +
                    "      }\n" +
                    "\n" +
                    "    private void doInstallBeforeLollipop() {\n" +
                    "          //婊¤冻3涓潯浠讹紝1.绗竴娆″畨瑁呭紑鍚紝2.涓昏繘绋嬶紝3.API<21(鍥犱负21涔嬪悗ART鐨勯€熷害姣攄alvik蹇帴杩?0鍊?姣曠珶5.0涔嬪悗鐨勬墜鏈烘€ц兘涔熻濂藉緢澶?)\n" +
                    "          if (isAppFirstInstall() && !isDexProcessOrOtherProcesses() && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {\n" +
                    "              try {\n" +
                    "                  createTempFile();\n" +
                    "                  startDexProcess();\n" +
                    "                  while (true) {\n" +
                    "                      if (existTempFile()) {\n" +
                    "                          try {\n" +
                    "                              Thread.sleep(50);\n" +
                    "                          } catch (InterruptedException e) {\n" +
                    "                              e.printStackTrace();\n" +
                    "                          }\n" +
                    "                      } else {\n" +
                    "                          setAppNoteFirstInstall();\n" +
                    "                          break;\n" +
                    "                      }\n" +
                    "                  }\n" +
                    "              } catch (IOException e) {\n" +
                    "                  e.printStackTrace();\n" +
                    "              }\n" +
                    "          }\n" +
                    "      }\n" +
                    "```\n" +
                    "\n" +
                    "  璇︾粏浠ｇ爜鍙锛歔Github 鈥?PhotoNoter/NoteApplication](https://github.com/yydcdut/PhotoNoter/blob/master/app/src/main/java/com/yydcdut/note/NoteApplication.java)\n" +
                    "\n" +
                    "  \u200B\n" +
                    "\n" +
                    "鎬荤殑鏉ヨ锛岃繖绉嶆柟寮忓ソ澶勫湪浜庝緷璧栭泦闈炲父绠€鍗曪紝鍚屾椂瀹冪殑闆嗘垚鏂瑰紡涔熸槸闈炲父绠€鍗曪紝鎴戜滑鏃犻』鍘讳慨鏀逛笌鍔犺浇鏃犲叧鐨勪唬鐮併€備絾鏄綋娌℃湁鍚姩杩?App 鐨勬椂鍊欙紝琚帹閫佸叏瀹舵《鍞ら啋鎴栬€呮敹鍒颁簡骞挎挱锛岃櫧鐒惰繖閲岄兘鏄病鏈夌晫闈㈢殑杩囩▼锛屼絾鏄繍鐢ㄤ簡杩欑鍔犺浇鏂瑰紡鐨勮瘽浼氬脊鍑?dexopt 杩涚▼鐨?Activity锛岀敤鎴风湅鍒颁細涓€鑴告嚨姣旂殑銆俓n" +
                    "\n" +
                    "## 鍧慭n" +
                    "\n" +
                    "### Too many classes in --main-dex-list\n" +
                    "\n" +
                    "> UNEXPECTED TOP-LEVEL EXCEPTION:com.android.dex.DexException: Too many classes in --main-dex-list, main dex capacity exceeded  at com.android.dx.command.dexer.Main.processAllFiles(Main.java:494)  at com.android.dx.command.dexer.Main.runMultiDex(Main.java:332)  at com.android.dx.command.dexer.Main.run(Main.java:243)  at com.android.dx.command.dexer.Main.main(Main.java:214)  at com.android.dx.command.Main.main(Main.java:106)\n" +
                    "\n" +
                    "閫氳繃 sdk 鐨?`mainDexClasses.rules` 鐭ラ亾涓?dex 閲岄潰浼氭湁 Application銆丄ctivity銆丼ervice銆丷eceiver銆丳rovider銆両nstrumentation銆丅ackupAgent 鍜?Annotation銆傚綋杩欎簺绫讳互鍙婄洿鎺ュ紩鐢ㄧ被姣旇緝澶氱殑鏃跺€欙紝閮借濉炶繘涓?dex 锛屽氨寮曞彂浜?main dex capacity exceeded build error 銆俓n" +
                    "\n" +
                    "涓轰簡瑙ｅ喅杩欎釜闂锛屽綋鎵ц `Create{flavor}{buildType}ManifestKeepList` task 涔嬪墠灏嗗叾涓殑 `activity` 鍘绘帀锛屼箣鍚庝細鍙戠幇 /build/intermediates/multi_dex/{flavor}/{buildType}/manifest_keep.txt 鏂囦欢涓凡缁忔病鏈?Activity 鐩稿叧鐨勭被浜嗐€俓n" +
                    "\n" +
                    "```\n" +
                    "def patchKeepSpecs() {\n" +
                    "    def taskClass = \"com.android.build.gradle.internal.tasks.multidex.CreateManifestKeepList\";\n" +
                    "    def clazz = this.class.classLoader.loadClass(taskClass)\n" +
                    "    def keepSpecsField = clazz.getDeclaredField(\"KEEP_SPECS\")\n" +
                    "    keepSpecsField.setAccessible(true)\n" +
                    "    def keepSpecsMap = (Map) keepSpecsField.get(null)\n" +
                    "    if (keepSpecsMap.remove(\"activity\") != null) {\n" +
                    "        println \"KEEP_SPECS patched: removed 'activity' root\"\n" +
                    "    } else {\n" +
                    "        println \"Failed to patch KEEP_SPECS: no 'activity' root found\"\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "patchKeepSpecs()\n" +
                    "```\n" +
                    "\n" +
                    "璇︾粏鍙互鐪?`CreateManifestKeepList` 鐨勬簮鐮侊細[Github -- CreateManifestKeepList](https://github.com/yydcdut/android_tools_base/blob/mm/build-system/gradle-core/src/main/groovy/com/android/build/gradle/internal/tasks/multidex/CreateManifestKeepList.groovy)\n" +
                    "\n" +
                    "### Too many classes in --main-dex-list\n" +
                    "\n" +
                    "娌￠敊锛岃繕鏄?Too many classes in --main-dex-list 鐨勯敊璇€傚湪缇庡洟鐨勮嚜鍔ㄦ媶鍖呬腑璁插埌锛歕n" +
                    "\n" +
                    "> 瀹為檯搴旂敤涓垜浠繕閬囧埌鍙﹀涓€涓瘮杈冩鎵嬬殑闂锛?灏辨槸Field鐨勮繃澶氱殑闂锛孎ield杩囧鏄敱鎴戜滑鐩墠閲囩敤鐨勪唬鐮佺粍缁囩粨鏋勫紩鍏ョ殑锛屾垜浠负浜嗘柟渚垮涓氬姟绾裤€佸鍥㈤槦骞跺彂鍗忎綔鐨勬儏鍐典笅寮€鍙戯紝鎴戜滑閲囩敤鐨刟ar鐨勬柟寮忚繘琛屽紑鍙戯紝骞跺悓鏃跺湪aar渚濊禆閾剧殑鏈€搴曞眰寮曞叆浜嗕竴涓€氱敤涓氬姟aar锛岃€岃繖涓€氱敤涓氬姟aar涓寘鍚簡寰堝璧勬簮锛岃€孉DT14浠ュ強鏇撮珮鐨勭増鏈腑瀵筁ibrary璧勬簮澶勭悊鏃讹紝Library鐨凴璧勬簮涓嶅啀鏄痵tatic final鐨勪簡锛孾璇︽儏璇锋煡鐪媑oogle瀹樻柟璇存槑](http://tools.android.com/tips/non-constant-fields)锛岃繖鏍峰湪鏈€缁堟墦鍖呮椂Library涓殑R娌℃硶鍋氬埌鍐呰仈锛岃繖鏍峰甫鏉ヤ簡R field杩囧鐨勬儏鍐碉紝瀵艰嚧闇€瑕佹媶鍒嗗涓猄econdary DEX锛屼负浜嗚В鍐宠繖涓棶棰樻垜浠噰鐢ㄧ殑鏄湪鎵撳寘杩囩▼涓埄鐢ㄨ剼鏈妸Libray涓璕 field锛堜緥濡侷D銆丩ayout銆丏rawable绛夛級鐨勫紩鐢ㄦ浛鎹㈡垚甯搁噺锛岀劧鍚庡垹鍘籐ibrary涓璕.class涓殑鐩稿簲Field銆俓n" +
                    "\n" +
                    "鍚屾牱锛宧u鍏充簬杩欎釜闂鍙互鍙傝€冭繖绡囧ぇ绁炵殑鏂囩珷锛歔褰揊ield閭傞€?5535](http://jiajixin.cn/2015/10/21/field-65535/) 銆俓n" +
                    "\n" +
                    "### DexException: Library dex files are not supported in multi-dex mode\n" +
                    "\n" +
                    "> com.android.dex.DexException: Library dex files are not supported in multi-dex mode\n" +
                    "> \u200B at com.android.dx.command.dexer.Main.runMultiDex(Main.java:322)    \n" +
                    "> \u200B at com.android.dx.command.dexer.Main.run(Main.java:228)\n" +
                    "> \u200B at com.android.dx.command.dexer.Main.main(Main.java:199)\n" +
                    "> \u200B at com.android.dx.command.Main.main(Main.java:103)\n" +
                    "\n" +
                    "瑙ｅ喅锛歕n" +
                    "\n" +
                    "```\n" +
                    "android {\n" +
                    "    dexOptions {\n" +
                    "        preDexLibraries = false\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "### OutOfMemoryError: Java heap space\n" +
                    "\n" +
                    "> UNEXPECTED TOP-LEVEL ERROR:\n" +
                    "> \u200B  java.lang.OutOfMemoryError: Java heap space\n" +
                    "\n" +
                    "瑙ｅ喅锛歕n" +
                    "\n" +
                    "```\n" +
                    "android {\n" +
                    "    dexOptions {\n" +
                    "        javaMaxHeapSize \"2g\"\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "## MultiDex.install(Context)\n" +
                    "\n" +
                    "鍥炶繃澶存潵鎴戜滑鐪嬬湅 `MultiDex.install()` 鍋氫簡涓€浜涗粈涔堬細\n" +
                    "\n" +
                    "```\n" +
                    "public final class MultiDex {\n" +
                    "\n" +
                    "    static {\n" +
                    "        //secondary-dexes鐨勪綅缃細/code_cache/secondary-dexes\n" +
                    "        SECONDARY_FOLDER_NAME = \"code_cache\" + File.separator + \"secondary-dexes\";\n" +
                    "        installedApk = new HashSet();\n" +
                    "        IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty(\"java.vm.version\"));\n" +
                    "    } \n" +
                    "\n" +
                    "    public static void install(Context context) {\n" +
                    "        Log.i(\"MultiDex\", \"install\");\n" +
                    "        if(IS_VM_MULTIDEX_CAPABLE) {//閽堝ART\n" +
                    "            Log.i(\"MultiDex\", \"VM has multidex support, MultiDex support library is disabled.\");\n" +
                    "        } else if(VERSION.SDK_INT < 4) {\n" +
                    "            throw new RuntimeException(\"Multi dex installation failed. SDK \" + VERSION.SDK_INT + \" is unsupported. Min SDK version is \" + 4 + \".\");\n" +
                    "        } else {\n" +
                    "            try {\n" +
                    "                ApplicationInfo e = getApplicationInfo(context);\n" +
                    "                if(e == null) {\n" +
                    "                    return;\n" +
                    "                }\n" +
                    "\n" +
                    "                Set var2 = installedApk;\n" +
                    "                synchronized(installedApk) {\n" +
                    "                    String apkPath = e.sourceDir;\n" +
                    "                    //installedApk鐨勭被鍨嬫槸锛歋et<String>锛屽鏋滆繖涓猘pk宸茬粡瀹夎锛屽垯涓嶉噸澶嶅畨瑁?  \n" +
                    "                    if(installedApk.contains(apkPath)) {\n" +
                    "                        return;\n" +
                    "                    }\n" +
                    "\n" +
                    "                    installedApk.add(apkPath);\n" +
                    "                    if(VERSION.SDK_INT > 20) {\n" +
                    "                        Log.w(\"MultiDex\", \"MultiDex is not guaranteed to work in SDK version \" + VERSION.SDK_INT + \": SDK version higher than \" + 20 + \" should be backed by \" + \"runtime with built-in multidex capabilty but it\\'s not the \" + \"case here: java.vm.version=\\\"\" + System.getProperty(\"java.vm.version\") + \"\\\"\");\n" +
                    "                    }\n" +
                    "          //绫诲姞杞藉櫒锛孭athClassLoader\n" +
                    "                    ClassLoader loader;\n" +
                    "                    try {\n" +
                    "                        loader = context.getClassLoader();\n" +
                    "                    } catch (RuntimeException var9) {\n" +
                    "                        Log.w(\"MultiDex\", \"Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.\", var9);\n" +
                    "                        return;\n" +
                    "                    }\n" +
                    "\n" +
                    "                    if(loader == null) {\n" +
                    "                        Log.e(\"MultiDex\", \"Context class loader is null. Must be running in test mode. Skip patching.\");\n" +
                    "                        return;\n" +
                    "                    }\n" +
                    "\n" +
                    "                    try {\n" +
                    "                        //鍒犻櫎浠ュ墠鐨刣ex\n" +
                    "                        clearOldDexDir(context);\n" +
                    "                    } catch (Throwable var8) {\n" +
                    "                        Log.w(\"MultiDex\", \"Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.\", var8);\n" +
                    "                    }\n" +
                    "          //dex灏嗕細杈撳嚭鍒?data/data/{packagename}/code_cache/secondary-dexes鐩綍銆? \n" +
                    "                    File dexDir = new File(e.dataDir, SECONDARY_FOLDER_NAME);\n" +
                    "                    List files = MultiDexExtractor.load(context, e, dexDir, false);\n" +
                    "                  //blablabla......\n" +
                    "                }\n" +
                    "            } catch (Exception var11) {\n" +
                    "                Log.e(\"MultiDex\", \"Multidex installation failure\", var11);\n" +
                    "                throw new RuntimeException(\"Multi dex installation failed (\" + var11.getMessage() + \").\");\n" +
                    "            }\n" +
                    "\n" +
                    "            Log.i(\"MultiDex\", \"install done\");\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "涔嬪墠閮芥槸鍑嗗宸ヤ綔锛岀劧鍚庤繘鍏?`MultiDexExtractor.load()` 鐪嬩竴涓嬶細\n" +
                    "\n" +
                    "```\n" +
                    "final class MultiDexExtractor {\n" +
                    "  static List<File> load(Context context, ApplicationInfo applicationInfo, File dexDir, boolean forceReload) throws IOException {\n" +
                    "        //dexDir鍦板潃鏄?data/data/{packagename}/code_cache/secondary-dexes\n" +
                    "        Log.i(\"MultiDex\", \"MultiDexExtractor.load(\" + applicationInfo.sourceDir + \", \" + forceReload + \")\");\n" +
                    "        //applicationInfo.sourceDir鍦板潃鏄?data/app/{packagename}-1.apk\n" +
                    "        File sourceApk = new File(applicationInfo.sourceDir);\n" +
                    "        //Crc鏍￠獙\n" +
                    "        long currentCrc = getZipCrc(sourceApk);\n" +
                    "        List files;\n" +
                    "        //isModified()鍒ゆ柇apk鏄惁琚慨鏀硅繃\n" +
                    "        if(!forceReload && !isModified(context, sourceApk, currentCrc)) {\n" +
                    "            try {\n" +
                    "                // 鍔犺浇宸茬粡瀛樺湪鐨勬枃浠讹紝濡傛灉鏈夌殑鏂囦欢涓嶅瓨鍦紝鎴栬€呬笉鏄痾ip鏂囦欢锛屽垯浼氭姏鍑哄紓甯? \n" +
                    "                files = loadExistingExtractions(context, sourceApk, dexDir);\n" +
                    "            } catch (IOException var9) {\n" +
                    "                Log.w(\"MultiDex\", \"Failed to reload existing extracted secondary dex files, falling back to fresh extraction\", var9);\n" +
                    "                // 浠巃pk涓彁鍙栧嚭澶歞ex锛岀劧鍚庡皢杩欎簺dex閫愪釜鎵撳寘涓簔ip鏂囦欢锛屾渶缁堣繑鍥炴彁鍙栧嚭鏉ョ殑zip鏂囦欢鍒楄〃\n" +
                    "                files = performExtractions(sourceApk, dexDir);\n" +
                    "        // getTimeStamp鏂规硶涓皟鐢ㄧ殑鏄痵ourceApk.lastModified()鏂规硶  \n" +
                    "                // putStoredApkInfo鏂规硶瀛樺偍apk鐨勪俊鎭細鏃堕棿鎴炽€乧rc鍊笺€乤pk涓璬ex鐨勬€讳釜鏁? \n" +
                    "                putStoredApkInfo(context, getTimeStamp(sourceApk), currentCrc, files.size() + 1);\n" +
                    "            }\n" +
                    "        } else {\n" +
                    "            Log.i(\"MultiDex\", \"Detected that extraction must be performed.\");\n" +
                    "            files = performExtractions(sourceApk, dexDir);\n" +
                    "            putStoredApkInfo(context, getTimeStamp(sourceApk), currentCrc, files.size() + 1);\n" +
                    "        }\n" +
                    "\n" +
                    "        Log.i(\"MultiDex\", \"load found \" + files.size() + \" secondary dex files\");\n" +
                    "        return files;\n" +
                    "    }\n" +
                    "\n" +
                    "    private static boolean isModified(Context context, File archive, long currentCrc) {\n" +
                    "        SharedPreferences prefs = getMultiDexPreferences(context);\n" +
                    "        return prefs.getLong(\"timestamp\", -1L) != getTimeStamp(archive) || prefs.getLong(\"crc\", -1L) != currentCrc;\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鏉ョ湅涓€涓?`performExtractions()`锛歕n" +
                    "\n" +
                    "```\n" +
                    "final class MultiDexExtractor {\n" +
                    "  private static List<File> performExtractions(File sourceApk, File dexDir) throws IOException {\n" +
                    "        //extractedFilePrefix鐨勫唴瀹规槸{packagename}-1.apk.classes\n" +
                    "        String extractedFilePrefix = sourceApk.getName() + \".classes\";\n" +
                    "        //鍑嗗鏂囦欢澶筡n" +
                    "        prepareDexDir(dexDir, extractedFilePrefix);\n" +
                    "        ArrayList files = new ArrayList();\n" +
                    "        ZipFile apk = new ZipFile(sourceApk);\n" +
                    "\n" +
                    "        try {\n" +
                    "            int e = 2;\n" +
                    "\n" +
                    "            for(ZipEntry dexFile = apk.getEntry(\"classes\" + e + \".dex\"); dexFile != null; dexFile = apk.getEntry(\"classes\" + e + \".dex\")) {//閭ｇe涓猟ex\n" +
                    "                //{packagename}-1.apk.classes2.zip\n" +
                    "                String fileName = extractedFilePrefix + e + \".zip\";\n" +
                    "                //extractedFile鍦板潃鏄?data/data/{packagename}/code_cache/secondary-dexes/com.yydcdut.note-1.apk.classes2.zip\n" +
                    "                File extractedFile = new File(dexDir, fileName);\n" +
                    "                files.add(extractedFile);\n" +
                    "                Log.i(\"MultiDex\", \"Extraction is needed for file \" + extractedFile);\n" +
                    "                int numAttempts = 0;\n" +
                    "                boolean isExtractionSuccessful = false;\n" +
                    "\n" +
                    "                while(numAttempts < 3 && !isExtractionSuccessful) {\n" +
                    "                    ++numAttempts;\n" +
                    "                    //鎻愬彇apk涓殑dex鏂囦欢锛岀劧鍚庢墦鍖呮垚涓€涓獄ip鏂嘰n" +
                    "                    extract(apk, dexFile, extractedFile, extractedFilePrefix);\n" +
                    "                    //楠岃瘉鎻愬彇鐨勬枃浠舵槸鍚︽槸涓€涓獄ip鏂囦欢銆? \n" +
                    "                    isExtractionSuccessful = verifyZipFile(extractedFile);\n" +
                    "                    Log.i(\"MultiDex\", \"Extraction \" + (isExtractionSuccessful?\"success\":\"failed\") + \" - length \" + extractedFile.getAbsolutePath() + \": \" + extractedFile.length());\n" +
                    "                    if(!isExtractionSuccessful) {\n" +
                    "                        extractedFile.delete();\n" +
                    "                        if(extractedFile.exists()) {\n" +
                    "                            Log.w(\"MultiDex\", \"Failed to delete corrupted secondary dex \\'\" + extractedFile.getPath() + \"\\'\");\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                }\n" +
                    "\n" +
                    "                if(!isExtractionSuccessful) {\n" +
                    "                    throw new IOException(\"Could not create zip file \" + extractedFile.getAbsolutePath() + \" for secondary dex (\" + e + \")\");\n" +
                    "                }\n" +
                    "\n" +
                    "                ++e;\n" +
                    "            }\n" +
                    "        } finally {\n" +
                    "            try {\n" +
                    "                apk.close();\n" +
                    "            } catch (IOException var16) {\n" +
                    "                Log.w(\"MultiDex\", \"Failed to close resource\", var16);\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        return files;\n" +
                    "    }\n" +
                    "\n" +
                    "    private static void prepareDexDir(File dexDir, final String extractedFilePrefix) throws IOException {\n" +
                    "        //dexDir鐨勫湴鍧€鏄細/data/data/{packagename}/code_cache/secondary-dexes\n" +
                    "        //extractedFilePrefix鐨勫唴瀹规槸data/app/{packagename}-1.apk.classes\n" +
                    "        File cache = dexDir.getParentFile();\n" +
                    "        //鍒涘缓鏂囦欢澶筡n" +
                    "        mkdirChecked(cache);\n" +
                    "        mkdirChecked(dexDir);\n" +
                    "        FileFilter filter = new FileFilter() {\n" +
                    "            public boolean accept(File pathname) {\n" +
                    "                return !pathname.getName().startsWith(extractedFilePrefix);\n" +
                    "            }\n" +
                    "        };\n" +
                    "        File[] files = dexDir.listFiles(filter);\n" +
                    "        if(files == null) {\n" +
                    "            Log.w(\"MultiDex\", \"Failed to list secondary dex dir content (\" + dexDir.getPath() + \").\");\n" +
                    "        } else {\n" +
                    "            File[] arr$ = files;\n" +
                    "            int len$ = files.length;\n" +
                    "\n" +
                    "            for(int i$ = 0; i$ < len$; ++i$) {\n" +
                    "                File oldFile = arr$[i$];\n" +
                    "                Log.i(\"MultiDex\", \"Trying to delete old file \" + oldFile.getPath() + \" of size \" + oldFile.length());\n" +
                    "                if(!oldFile.delete()) {\n" +
                    "                    Log.w(\"MultiDex\", \"Failed to delete old file \" + oldFile.getPath());\n" +
                    "                } else {\n" +
                    "                    Log.i(\"MultiDex\", \"Deleted old file \" + oldFile.getPath());\n" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鑷範鐪嬩竴涓?`extract()` 鍋氱殑浜嬶細\n" +
                    "\n" +
                    "```\n" +
                    "final class MultiDexExtractor {\n" +
                    "  private static void extract(ZipFile apk, ZipEntry dexFile, File extractTo, String extractedFilePrefix) throws IOException, FileNotFoundException {\n" +
                    "        InputStream in = apk.getInputStream(dexFile);\n" +
                    "        ZipOutputStream out = null;\n" +
                    "        //鍒涘缓涓存椂鏂囦欢锛屽湴鍧€/data/data/{packagename}/code_cache/secondary-dexes/{packagename}-1.apk.classes941893003.zip\n" +
                    "        File tmp = File.createTempFile(extractedFilePrefix, \".zip\", extractTo.getParentFile());\n" +
                    "        Log.i(\"MultiDex\", \"Extracting \" + tmp.getPath());\n" +
                    "    //鍙榸ip\n" +
                    "        try {\n" +
                    "            out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(tmp)));\n" +
                    "\n" +
                    "            try {\n" +
                    "                ZipEntry classesDex = new ZipEntry(\"classes.dex\");\n" +
                    "                classesDex.setTime(dexFile.getTime());\n" +
                    "                out.putNextEntry(classesDex);\n" +
                    "                byte[] buffer = new byte[16384];\n" +
                    "\n" +
                    "                for(int length = in.read(buffer); length != -1; length = in.read(buffer)) {\n" +
                    "                    out.write(buffer, 0, length);\n" +
                    "                }\n" +
                    "\n" +
                    "                out.closeEntry();\n" +
                    "            } finally {\n" +
                    "                out.close();\n" +
                    "            }\n" +
                    "      //extractTo鐨勫湴鍧€鏄?/data/data/{packagename}/code_cache/secondary-dexes/{packagename}-1.apk.classes2.zip\n" +
                    "            Log.i(\"MultiDex\", \"Renaming to \" + extractTo.getPath());\n" +
                    "            //閲嶆槑鏄嶾n" +
                    "            if(!tmp.renameTo(extractTo)) {\n" +
                    "                throw new IOException(\"Failed to rename \\\"\" + tmp.getAbsolutePath() + \"\\\" to \\\"\" + extractTo.getAbsolutePath() + \"\\\"\");\n" +
                    "            }\n" +
                    "        } finally {\n" +
                    "            closeQuietly(in);\n" +
                    "            tmp.delete();\n" +
                    "        }\n" +
                    "\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鎵ц瀹岃繖閲岋紝`List files = MultiDexExtractor.load(context, e, dexDir, false);` 涔熷氨鎵ц瀹屼簡锛岀户缁湅 `MultiDex.install()`锛歕n" +
                    "\n" +
                    "```\n" +
                    "public final class MultiDex {\n" +
                    "\n" +
                    "\n" +
                    "    public static void install(Context context) {\n" +
                    "        Log.i(\"MultiDex\", \"install\");\n" +
                    "        if(IS_VM_MULTIDEX_CAPABLE) {//閽堝ART\n" +
                    "            Log.i(\"MultiDex\", \"VM has multidex support, MultiDex support library is disabled.\");\n" +
                    "        } else if(VERSION.SDK_INT < 4) {\n" +
                    "            throw new RuntimeException(\"Multi dex installation failed. SDK \" + VERSION.SDK_INT + \" is unsupported. Min SDK version is \" + 4 + \".\");\n" +
                    "        } else {\n" +
                    "            try {\n" +
                    "                  //blablabla......\n" +
                    "          //dex灏嗕細杈撳嚭鍒?data/data/{packagename}/code_cache/secondary-dexes鐩綍銆? \n" +
                    "                    File dexDir = new File(e.dataDir, SECONDARY_FOLDER_NAME);\n" +
                    "                    List files = MultiDexExtractor.load(context, e, dexDir, false);\n" +
                    "          //鏍￠獙杩欎簺zip鏂囦欢鏄惁鍚堟硶  \n" +
                    "                    if(checkValidZipFiles(files)) {\n" +
                    "                        //瀹夎鎻愬彇鍑烘潵鐨剒ip鏂囦欢  \n" +
                    "                        installSecondaryDexes(loader, dexDir, files);\n" +
                    "                    } else {//涓嶅悎娉曠殑鎯呭喌涓嬪己鍒秎oad涓€閬峔n" +
                    "                        Log.w(\"MultiDex\", \"Files were not valid zip files.  Forcing a reload.\");\n" +
                    "                         //鏈€鍚庝竴涓弬鏁版槸true锛屼唬琛ㄥ己鍒跺姞杞絓n" +
                    "                        files = MultiDexExtractor.load(context, e, dexDir, true);\n" +
                    "                        //杩樻槸涓嶅悎娉曠殑灏辨姏寮傚父\n" +
                    "                        if(!checkValidZipFiles(files)) {\n" +
                    "                            throw new RuntimeException(\"Zip files were not valid.\");\n" +
                    "                        }\n" +
                    "            //缁堜簬鍚堟硶浜嗭紝瀹夎zip鏂囦欢\n" +
                    "                        installSecondaryDexes(loader, dexDir, files);\n" +
                    "                    }\n" +
                    "                }\n" +
                    "            } catch (Exception var11) {\n" +
                    "                Log.e(\"MultiDex\", \"Multidex installation failure\", var11);\n" +
                    "                throw new RuntimeException(\"Multi dex installation failed (\" + var11.getMessage() + \").\");\n" +
                    "            }\n" +
                    "\n" +
                    "            Log.i(\"MultiDex\", \"install done\");\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "`installSecondaryDexes(loader, dexDir, files)` 姣旇緝閲嶈锛屽湪杩欎釜鏂规硶閲岄潰杩涜灏嗙浜屼釜 dex 鐨勪唬鐮佸姞杞藉埌绋嬪簭涓€俓n" +
                    "\n" +
                    "```\n" +
                    "public final class MultiDex {\n" +
                    "  private static void installSecondaryDexes(ClassLoader loader, File dexDir, List<File> files) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {\n" +
                    "        //鍒嗙増鏈姞杞絓n" +
                    "        if(!files.isEmpty()) {\n" +
                    "            if(VERSION.SDK_INT >= 19) {\n" +
                    "                MultiDex.V19.install(loader, files, dexDir);\n" +
                    "            } else if(VERSION.SDK_INT >= 14) {\n" +
                    "                MultiDex.V14.install(loader, files, dexDir);\n" +
                    "            } else {\n" +
                    "                MultiDex.V4.install(loader, files);\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鏉ョ湅鐪?`MultiDex.V14.install(loader, files, dexDir);` :\n" +
                    "\n" +
                    "```\n" +
                    "public final class MultiDex {\n" +
                    "    private static final class V14 {\n" +
                    "    private static void install(ClassLoader loader, List<File> additionalClassPathEntries, File optimizedDirectory) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {\n" +
                    "            //optimizedDirectory鍦板潃鏄?data/data/{packagename}/code_cache/secondary-dexes\n" +
                    "            //鍙嶅皠鎵惧埌PathClassLoader鐨刾athList灞炴€э紝鏄疍exPathList绫伙紝杩欎釜灞炴€ф槸鐖剁被 BaseDexClassLoader\n" +
                    "            Field pathListField = MultiDex.findField(loader, \"pathList\");\n" +
                    "            Object dexPathList = pathListField.get(loader);\n" +
                    "            //dexElements涓篸exPathList鐨勪竴涓睘鎬э紝鏄疎lement鏁扮粍\n" +
                    "            MultiDex.expandFieldArray(dexPathList, \"dexElements\", makeDexElements(dexPathList, new ArrayList(additionalClassPathEntries), optimizedDirectory));\n" +
                    "        }\n" +
                    "\n" +
                    "    private static Object[] makeDexElements(Object dexPathList, ArrayList<File> files, File optimizedDirectory) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {\n" +
                    "          //鍙嶅皠鎷垮埌dexPathList鐨勬柟娉昺akeDexElements锛宲rivate static Element[] makeDexElements(ArrayList<File> files, File optimizedDirectory, ArrayList<IOException> suppressedExceptions)\n" +
                    "            Method makeDexElements = MultiDex.findMethod(dexPathList, \"makeDexElements\", new Class[]{ArrayList.class, File.class});\n" +
                    "            //璋冪敤鏂规硶锛岃鏂规硶鐨勪綔鐢ㄦ槸閫氳繃浼犲叆鐨刦iles鍘诲姞杞絡ar鎴栬€厇ip锛屽皝瑁呮垚DexFile锛屽湪灏佽鎴怑lement杩斿洖\n" +
                    "            return (Object[])((Object[])makeDexElements.invoke(dexPathList, new Object[]{files, optimizedDirectory}));\n" +
                    "        }\n" +
                    "  }\n" +
                    "\n" +
                    "  private static void expandFieldArray(Object instance, String fieldName, Object[] extraElements) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {\n" +
                    "        //鎵惧埌dexElements杩欎釜灞炴€n" +
                    "        Field jlrField = findField(instance, fieldName);\n" +
                    "        //classloader涓師濮嬬殑dexElements\n" +
                    "        Object[] original = (Object[])((Object[])jlrField.get(instance));\n" +
                    "        //new涓€涓柊鐨勫嚭鏉n" +
                    "        Object[] combined = (Object[])((Object[])Array.newInstance(original.getClass().getComponentType(), original.length + extraElements.length));\n" +
                    "        //灏嗗師鏈夌殑澶嶅埗鍒版柊鐨勯噷闈㈠幓\n" +
                    "        System.arraycopy(original, 0, combined, 0, original.length);\n" +
                    "        //灏嗙浜屼釜dex鐨勫鍒跺埌鏂扮殑閲岄潰鍘籠n" +
                    "        System.arraycopy(extraElements, 0, combined, original.length, extraElements.length);\n" +
                    "        //鍐嶅鍥炲幓\n" +
                    "        jlrField.set(instance, combined);\n" +
                    "    }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "鑷虫锛宍MultiDex.install()` 鍒嗘瀽瀹屼簡锛岃繖閲屽彧璁蹭竴涓媀14鐨勶紝鍦?Java 灞傜殑涓昏娴佺▼灏嗙浜屼釜 dex 鍙栧嚭锛堢幇鍦ㄥ彧鑰冭檻涓や釜 dex 鐨勬儏鍐碉級锛屾暣鎴?Zip 褰㈠紡鐨勶紝鐒跺悗閫氳繃鍙嶅皠灏?zip 鐨勫湴鍧€绛夊弬鏁板皝瑁呰捣鏉ュ啀濉炵粰 PathClassLoader 銆備负浠€涔堟槸 Zip 锛屽洜涓哄湪 BaseDexClassLoader 涓?`DexFile.loadDex()` 鍙帴鍙?jar 鎴栬€?zip銆俓n" +
                    "\n" +
                    "鏇村鐨勫彲浠ュ弬鑰冿細Github -- [BaseDexClassLoader](https://github.com/yydcdut/android_libcore/blob/kitkat/dalvik/src/main/java/dalvik/system/BaseDexClassLoader.java) [DexFile](https://github.com/yydcdut/android_libcore/blob/kitkat/dalvik/src/main/java/dalvik/system/DexFile.java) [DexPathList](https://github.com/yydcdut/android_libcore/blob/kitkat/dalvik/src/main/java/dalvik/system/DexPathList.java)\n" +
                    "\n" +
                    "## Jack\n" +
                    "\n" +
                    "閫氳繃 [Experimental New Android Tool Chain - Jack and Jill](http://tools.android.com/tech-docs/jackandjill) 鏌ョ湅鍒?build tools 21.1.1 寮€濮嬪氨鏀寔 `Jack` 浜嗐€俓n" +
                    "\n" +
                    "閭ｄ箞鎴戜滑鐩存帴浣跨敤鏂囩珷缁欏嚭鐨?jack 鍦?gradle 涓殑鐢ㄦ硶浣跨敤缂栬瘧宸ョ▼鍚э細\n" +
                    "\n" +
                    "```\n" +
                    "buildscript {\n" +
                    "\t//...\n" +
                    "    dependencies {\n" +
                    "        classpath 'com.android.tools.build:gradle:2.1.0-alpha3'\n" +
                    "    }\n" +
                    "}\n" +
                    "android {\n" +
                    "    //...\n" +
                    "    buildToolsVersion '21.1.2'\n" +
                    "  \tminSdkVersion 21\n" +
                    "    defaultConfig {\n" +
                    "    // Enable the experimental Jack build tools.\n" +
                    "    useJack = true\n" +
                    "    }\n" +
                    "    //...\n" +
                    "  compileOptions {\n" +
                    "    sourceCompatibility JavaVersion.VERSION_1_8\n" +
                    "    targetCompatibility JavaVersion.VERSION_1_8\n" +
                    "  }\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "浣嗘槸鍦ㄥ疄闄呯紪璇戣繃绋嬩腑鍑虹幇浜嗛棶棰橈細\n" +
                    "> Error:Execution failed for task ':app:jillDebugPackagedLibraries'.\n" +
                    ">  Jack requires Build Tools 24.0.0 or later\n" +
                    "\n" +
                    "閭ｄ箞鎶?build tool 鏇存柊鍒?`24.0.0rc1` 鍐嶈瘯璇曞惂锛歕n" +
                    "\n" +
                    "```\n" +
                    "android {\n" +
                    "    ...\n" +
                    "    buildToolsVersion '24.0.0rc1'\n" +
                    "    ...\n" +
                    "}\n" +
                    "```\n" +
                    "\n" +
                    "閲嶆柊缂栬瘧锛岀劧鍚庡綋 gradle 杩愯鍒?`compileDebugJavaWithJack` 鐨勬椂鍊欙細\n" +
                    "\n" +
                    "> ERROR: Dex writing phase: classes.dex has too many IDs. Try using multi-dex\n" +
                    "> com.android.jack.api.v01.CompilationException: Dex writing phase: classes.dex has too many IDs. Try using multi-dex\n" +
                    "> \u200B\tat com.android.jack.api.v01.impl.Api01ConfigImpl$Api01CompilationTaskImpl.run(Api01ConfigImpl.java:113)\n" +
                    "> \u200B\tat com.android.builder.core.AndroidBuilder.convertByteCodeUsingJackApis(AndroidBuilder.java:1904)\n" +
                    "> \u200B\tat com.android.build.gradle.tasks.JackTask.doMinification(JackTask.java:148)\n" +
                    "> \u200B\tat com.android.build.gradle.tasks.JackTask.access$000(JackTask.java:73)\n" +
                    "> \u200B\tat com.android.build.gradle.tasks.JackTask$1.run(JackTask.java:112)\n" +
                    "> \u200B\tat com.android.builder.tasks.Job.runTask(Job.java:51)\n" +
                    "> \u200B\tat com.android.build.gradle.tasks.SimpleWorkQueue$EmptyThreadContext.runTask(SimpleWorkQueue.java:41)\n" +
                    "> \u200B\tat com.android.builder.tasks.WorkQueue.run(WorkQueue.java:223)\n" +
                    "> \u200B\tat java.lang.Thread.run(Thread.java:745)\n" +
                    "> Caused by: com.android.jack.JackAbortException: Dex writing phase: classes.dex has too many IDs. Try using multi-dex\n" +
                    "> \u200B\tat com.android.jack.backend.dex.DexFileWriter.run(DexFileWriter.java:90)\n" +
                    "> \u200B\tat com.android.jack.backend.dex.DexFileWriter.run(DexFileWriter.java:41)\n" +
                    "> \u200B\tat com.android.sched.scheduler.ScheduleInstance.runWithLog(ScheduleInstance.java:161)\n" +
                    "> \u200B\tat com.android.sched.scheduler.MultiWorkersScheduleInstance$SequentialTask.process(MultiWorkersScheduleInstance.java:442)\n" +
                    "> \u200B\tat com.android.sched.scheduler.MultiWorkersScheduleInstance$Worker.run(MultiWorkersScheduleInstance.java:162)\n" +
                    "> Caused by: com.android.jack.backend.dex.DexWritingException: Dex writing phase: classes.dex has too many IDs. Try using multi-dex\n" +
                    "> \u200B\tat com.android.jack.backend.dex.SingleDexWritingTool.write(SingleDexWritingTool.java:64)\n" +
                    "> \u200B\tat com.android.jack.backend.dex.DexFileWriter.run(DexFileWriter.java:87)\n" +
                    "> \u200B\t... 4 more\n" +
                    "> Caused by: com.android.jack.backend.dex.SingleDexOverflowException: classes.dex has too many IDs. Try using multi-dex\n" +
                    "> \u200B\t... 6 more\n" +
                    "> Caused by: com.android.jack.tools.merger.MethodIdOverflowException: Method ID overflow when trying to merge dex files\n" +
                    "> \u200B\tat com.android.jack.tools.merger.ConstantManager.addDexFile(ConstantManager.java:177)\n" +
                    "> \u200B\tat com.android.jack.tools.merger.JackMerger.addDexFile(JackMerger.java:69)\n" +
                    "> \u200B\tat com.android.jack.backend.dex.DexWritingTool.mergeDex(DexWritingTool.java:107)\n" +
                    "> \u200B\tat com.android.jack.backend.dex.SingleDexWritingTool.write(SingleDexWritingTool.java:62)\n" +
                    "> \u200B\t... 5 more\n" +
                    ">\n" +
                    "> \n" +
                    "\n" +
                    "杩樻槸寰椾娇鐢?multidex 銆俲ack 涓嶆敮鎸?`instantRun` 锛屽悓鏍?gradle 鏄?`2.1.0-alpha3` 锛岃繖閲屽氨闇€瑕?multidex 浜嗐€?65536 鐨勬牴鏈棶棰樺苟涓嶅湪浜? jack 韬笂锛岃€屽湪浜庢寚浠ら泦韬笂锛宩ack 涔熸槸閲囩敤鐨?multidex 鏉ヨВ鍐宠繖涓棶棰樼殑銆俓n" +
                    "\n" +
                    "\n" +
                    "鏇村 jack 鐨勮祫鏂欙細\n" +
                    "\n" +
                    "* [Experimental New Android Tool Chain - Jack and Jill](http://tools.android.com/tech-docs/jackandjill)\n" +
                    "* [Jack (Java Android Compiler Kit)](https://source.android.com/source/jack.html)\n" +
                    "* [Java 8 Language Features](http://developer.android.com/intl/zh-tw/preview/j8-jack.html)\n" +
                    "* [The upcoming Jack & Jill compilers in Android](https://www.guardsquare.com/blog/the_upcoming_jack_and_jill_compilers_in_android)\n" +
                    "* [The New **Android** Compilers - Meet **Jack** And Jill](http://www.i-programmer.info/news/193-android/8072-the-new-android-compilers-meet-jack-and-jill.html)\n" +
                    "* [Hello World, meet our new experimental toolchain, Jack and Jill | Android Developers Blog](android-developers.blogspot.co.uk/2014/12/hello-world-meet-our-new-experimental.html)\n" +
                    "\n" +
                    "## 鍙傝€僜n" +
                    "\n" +
                    "* [缇庡洟Android DEX鑷姩鎷嗗寘鍙婂姩鎬佸姞杞界畝浠媇(http://tech.meituan.com/mt-android-auto-split-dex.html)\n" +
                    "* [Android鎷嗗垎涓庡姞杞紻ex鐨勫绉嶆柟妗堝姣擼(http://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=207151651&idx=1&sn=9eab282711f4eb2b4daf2fbae5a5ca9a&3rd=MzA3MDU4NTYzMw==&scene=6#rd)\n" +
                    "* [鍏跺疄浣犱笉鐭ラ亾MultiDex鍒板簳鏈夊鍧慮(http://blog.zongwu233.com/the-touble-of-multidex)\n" +
                    "* [Alex Lipov @ osom.info: Too many methods in main-dex?](http://blog.osom.info/2014/12/too-many-methods-in-main-dex.html)\n" +
                    "* [casidiablo/multidex](https://github.com/casidiablo/multidex)\n" +
                    "* [鐢盇ndroid 65K鏂规硶鏁伴檺鍒跺紩鍙戠殑鎬濊€僝(http://jayfeng.com/2016/03/10/%E7%94%B1Android-65K%E6%96%B9%E6%B3%95%E6%95%B0%E9%99%90%E5%88%B6%E5%BC%95%E5%8F%91%E7%9A%84%E6%80%9D%E8%80%83/)";

}

