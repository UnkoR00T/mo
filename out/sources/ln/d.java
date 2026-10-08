package ln;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends n {

    private enum b {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[][] f118873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b[][] f118874b;

        private enum a {
            A,
            B,
            C,
            NONE
        }

        private enum b {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private c() {
        }

        private static void b(Collection<int[]> collection, int i15, int[] iArr, int[] iArr2, int i16) {
            collection.add(ln.c.f118867a[i15]);
            if (i16 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i15 * iArr2[0]);
        }

        private boolean c(CharSequence charSequence, a aVar, int i15) {
            int i16;
            char cCharAt = charSequence.charAt(i15);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(cCharAt) >= 0;
            }
            if (iOrdinal == 1) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(cCharAt) >= 0;
            }
            if (iOrdinal != 2) {
                return false;
            }
            return cCharAt == 241 || ((i16 = i15 + 1) < charSequence.length() && f(cCharAt) && f(charSequence.charAt(i16)));
        }

        private int d(CharSequence charSequence, a aVar, int i15) {
            int iD;
            int iD2;
            int i16 = this.f118873a[aVar.ordinal()][i15];
            if (i16 > 0) {
                return i16;
            }
            b bVar = b.NONE;
            int i17 = i15 + 1;
            int i18 = 0;
            boolean z15 = i17 >= charSequence.length();
            a[] aVarArr = {a.A, a.B};
            int i19 = Integer.MAX_VALUE;
            while (true) {
                if (i18 > 1) {
                    break;
                }
                if (c(charSequence, aVarArr[i18], i15)) {
                    b bVarValueOf = b.NONE;
                    a aVar2 = aVarArr[i18];
                    if (aVar != aVar2) {
                        bVarValueOf = b.valueOf(aVar2.toString());
                        iD2 = 2;
                    } else {
                        iD2 = 1;
                    }
                    if (!z15) {
                        iD2 += d(charSequence, aVarArr[i18], i17);
                    }
                    if (iD2 < i19) {
                        bVar = bVarValueOf;
                        i19 = iD2;
                    }
                    if (aVar == aVarArr[(i18 + 1) % 2]) {
                        b bVar2 = b.SHIFT;
                        int iD3 = z15 ? 2 : 2 + d(charSequence, aVar, i17);
                        if (iD3 < i19) {
                            i19 = iD3;
                            bVar = bVar2;
                        }
                    }
                }
                i18++;
            }
            a aVar3 = a.C;
            if (c(charSequence, aVar3, i15)) {
                b bVar3 = b.NONE;
                if (aVar != aVar3) {
                    bVar3 = b.C;
                    iD = 2;
                } else {
                    iD = 1;
                }
                int i25 = (charSequence.charAt(i15) != 241 ? 2 : 1) + i15;
                if (i25 < charSequence.length()) {
                    iD += d(charSequence, aVar3, i25);
                }
                if (iD < i19) {
                    bVar = bVar3;
                    i19 = iD;
                }
            }
            if (i19 != Integer.MAX_VALUE) {
                this.f118873a[aVar.ordinal()][i15] = i19;
                this.f118874b[aVar.ordinal()][i15] = bVar;
                return i19;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i15)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean[] e(String str) {
            this.f118873a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, str.length());
            this.f118874b = (b[][]) Array.newInstance((Class<?>) b.class, 4, str.length());
            a aVar = a.NONE;
            d(str, aVar, 0);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {1};
            int length = str.length();
            int i15 = 0;
            while (i15 < length) {
                b bVar = this.f118874b[aVar.ordinal()][i15];
                int iOrdinal = bVar.ordinal();
                int iCharAt = 101;
                if (iOrdinal == 0) {
                    aVar = a.A;
                    b(arrayList, i15 == 0 ? 103 : 101, iArr, iArr2, i15);
                } else if (iOrdinal == 1) {
                    aVar = a.B;
                    b(arrayList, i15 == 0 ? 104 : 100, iArr, iArr2, i15);
                } else if (iOrdinal == 2) {
                    aVar = a.C;
                    b(arrayList, i15 == 0 ? 105 : 99, iArr, iArr2, i15);
                } else if (iOrdinal == 3) {
                    b(arrayList, 98, iArr, iArr2, i15);
                }
                if (aVar != a.C) {
                    switch (str.charAt(i15)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            if ((aVar != a.A || bVar == b.SHIFT) && (aVar != a.B || bVar != b.SHIFT)) {
                                iCharAt = 100;
                            }
                            break;
                        default:
                            iCharAt = str.charAt(i15) - ' ';
                            break;
                    }
                    if (((aVar == a.A && bVar != b.SHIFT) || (aVar == a.B && bVar == b.SHIFT)) && iCharAt < 0) {
                        iCharAt += 96;
                    }
                    b(arrayList, iCharAt, iArr, iArr2, i15);
                } else if (str.charAt(i15) == 241) {
                    b(arrayList, 102, iArr, iArr2, i15);
                } else {
                    b(arrayList, Integer.parseInt(str.substring(i15, i15 + 2)), iArr, iArr2, i15);
                    int i16 = i15 + 1;
                    if (i16 < length) {
                        i15 = i16;
                    }
                }
                i15++;
            }
            this.f118873a = null;
            this.f118874b = null;
            return d.m(arrayList, iArr[0]);
        }

        private static boolean f(char c15) {
            return c15 >= '0' && c15 <= '9';
        }
    }

    private static int i(String str, Map<en.c, ?> map) {
        if (map != null) {
            en.c cVar = en.c.FORCE_CODE_SET;
            if (map.containsKey(cVar)) {
                String string = map.get(cVar).toString();
                string.getClass();
                switch (string) {
                    case "A":
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported code set hint: " + string);
                }
            }
        }
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) cCharAt));
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ln.d.i(java.lang.String, java.util.Map):int");
        }

        private static int j(CharSequence charSequence, int i15, int i16) {
            b bVarL;
            b bVarL2;
            char cCharAt;
            b bVarL3 = l(charSequence, i15);
            b bVar = b.ONE_DIGIT;
            if (bVarL3 == bVar) {
                return i16 == 101 ? 101 : 100;
            }
            b bVar2 = b.UNCODABLE;
            if (bVarL3 == bVar2) {
                return (i15 >= charSequence.length() || ((cCharAt = charSequence.charAt(i15)) >= ' ' && (i16 != 101 || (cCharAt >= '`' && (cCharAt < 241 || cCharAt > 244))))) ? 100 : 101;
            }
            if (i16 == 101 && bVarL3 == b.FNC_1) {
                return 101;
            }
            if (i16 == 99) {
                return 99;
            }
            if (i16 != 100) {
                if (bVarL3 == b.FNC_1) {
                    bVarL3 = l(charSequence, i15 + 1);
                }
                return bVarL3 == b.TWO_DIGITS ? 99 : 100;
            }
            b bVar3 = b.FNC_1;
            if (bVarL3 == bVar3 || (bVarL = l(charSequence, i15 + 2)) == bVar2 || bVarL == bVar) {
                return 100;
            }
            if (bVarL == bVar3) {
                return l(charSequence, i15 + 3) == b.TWO_DIGITS ? 99 : 100;
            }
            int i17 = i15 + 4;
            while (true) {
                bVarL2 = l(charSequence, i17);
                if (bVarL2 != b.TWO_DIGITS) {
                    break;
                }
                i17 += 2;
            }
            return bVarL2 == b.ONE_DIGIT ? 100 : 99;
        }

        private static boolean[] k(String str, int i15) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1;
            while (i16 < length) {
                int iJ = i15 == -1 ? j(str, i16, i18) : i15;
                int iCharAt = 100;
                if (iJ == i18) {
                    switch (str.charAt(i16)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            if (i18 == 101) {
                                iCharAt = 101;
                            }
                            break;
                        default:
                            if (i18 == 100) {
                                iCharAt = str.charAt(i16) - ' ';
                            } else if (i18 == 101) {
                                char cCharAt = str.charAt(i16);
                                iCharAt = cCharAt - ' ';
                                if (iCharAt < 0) {
                                    iCharAt = cCharAt + '@';
                                }
                            } else {
                                int i25 = i16 + 1;
                                if (i25 == length) {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                                iCharAt = Integer.parseInt(str.substring(i16, i16 + 2));
                                i16 = i25;
                            }
                            break;
                    }
                    i16++;
                } else {
                    if (i18 == 0) {
                        iCharAt = iJ != 100 ? iJ != 101 ? 105 : 103 : 104;
                    } else {
                        iCharAt = iJ;
                    }
                    i18 = iJ;
                }
                arrayList.add(ln.c.f118867a[iCharAt]);
                i17 += iCharAt * i19;
                if (i16 != 0) {
                    i19++;
                }
            }
            return m(arrayList, i17);
        }

        private static b l(CharSequence charSequence, int i15) {
            int length = charSequence.length();
            if (i15 >= length) {
                return b.UNCODABLE;
            }
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt == 241) {
                return b.FNC_1;
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return b.UNCODABLE;
            }
            int i16 = i15 + 1;
            if (i16 >= length) {
                return b.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i16);
            return (cCharAt2 < '0' || cCharAt2 > '9') ? b.ONE_DIGIT : b.TWO_DIGITS;
        }

        static boolean[] m(Collection<int[]> collection, int i15) {
            int i16 = i15 % 103;
            if (i16 < 0) {
                throw new IllegalArgumentException("Unable to compute a valid input checksum");
            }
            int[][] iArr = ln.c.f118867a;
            collection.add(iArr[i16]);
            collection.add(iArr[106]);
            int iB = 0;
            int i17 = 0;
            for (int[] iArr2 : collection) {
                for (int i18 : iArr2) {
                    i17 += i18;
                }
            }
            boolean[] zArr = new boolean[i17];
            Iterator<int[]> it = collection.iterator();
            while (it.hasNext()) {
                iB += n.b(zArr, iB, it.next(), true);
            }
            return zArr;
        }

        @Override // ln.n
        public boolean[] d(String str) {
            return e(str, null);
        }

        @Override // ln.n
        public boolean[] e(String str, Map<en.c, ?> map) {
            int i15 = i(str, map);
            if (map != null) {
                en.c cVar = en.c.CODE128_COMPACT;
                if (map.containsKey(cVar) && Boolean.parseBoolean(map.get(cVar).toString())) {
                    return new c().e(str);
                }
            }
            return k(str, i15);
        }

        @Override // ln.n
        protected Collection<en.a> g() {
            return Collections.singleton(en.a.CODE_128);
        }
    }
