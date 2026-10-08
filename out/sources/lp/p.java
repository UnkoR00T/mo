package lp;

import io.sentry.android.core.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import so.n0;
import so.o0;
import so.p0;

/* JADX INFO: loaded from: classes4.dex */
final class p extends j0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gp.c f119148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a0 f119149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bp.d f119150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bp.d f119151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f119152l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119153a;

        static {
            int[] iArr = new int[b.values().length];
            f119153a = iArr;
            try {
                iArr[b.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119153a[b.BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119153a[b.SERIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum b {
        FIRST,
        BRACKET,
        SERIAL
    }

    p(gp.c cVar, bp.d dVar, n0 n0Var, boolean z15, a0 a0Var, boolean z16) throws IOException {
        super(cVar, dVar, n0Var, z15);
        this.f119148h = cVar;
        this.f119150j = dVar;
        this.f119149i = a0Var;
        this.f119152l = z16;
        dVar.Y4(bp.i.f20938y8, bp.i.f20742f9);
        dVar.d5(bp.i.f20897v0, this.f119114c.k());
        dVar.Y4(bp.i.f20716d3, z16 ? bp.i.f20869s4 : bp.i.f20858r4);
        bp.d dVarS = s();
        this.f119151k = dVarS;
        bp.a aVar = new bp.a();
        aVar.A3(dVarS);
        dVar.Y4(bp.i.f20785k2, aVar);
        if (z15) {
            return;
        }
        m(null);
    }

    private void j(String str) {
        String str2 = str + this.f119114c.k();
        bp.d dVar = this.f119150j;
        bp.i iVar = bp.i.f20897v0;
        dVar.d5(iVar, str2);
        this.f119114c.F(str2);
        this.f119151k.d5(iVar, str2);
    }

    private void k(TreeMap<Integer, Integer> treeMap) {
        int iIntValue = treeMap.lastKey().intValue();
        byte[] bArr = new byte[(iIntValue / 8) + 1];
        for (int i15 = 0; i15 <= iIntValue; i15++) {
            int i16 = i15 / 8;
            bArr[i16] = (byte) ((1 << (7 - (i15 % 8))) | bArr[i16]);
        }
        this.f119114c.v(new hp.h(this.f119148h, (InputStream) new ByteArrayInputStream(bArr), bp.i.E3));
    }

    private void l(TreeMap<Integer, Integer> treeMap) {
        int iIntValue = treeMap.lastKey().intValue();
        byte[] bArr = new byte[(iIntValue * 2) + 2];
        int i15 = 0;
        for (int i16 = 0; i16 <= iIntValue; i16++) {
            Integer num = treeMap.get(Integer.valueOf(i16));
            if (num != null) {
                bArr[i15] = (byte) ((num.intValue() >> 8) & GF2Field.MASK);
                bArr[i15 + 1] = (byte) (num.intValue() & GF2Field.MASK);
            }
            i15 += 2;
        }
        this.f119151k.Z4(bp.i.f20814n1, new hp.h(this.f119148h, (InputStream) new ByteArrayInputStream(bArr), bp.i.E3));
    }

    private void m(Map<Integer, Integer> map) throws IOException {
        int iIntValue;
        i0 i0Var = new i0();
        int iW = this.f119113b.O().w();
        boolean z15 = false;
        for (int i15 = 1; i15 <= iW; i15++) {
            if (map != null) {
                if (map.containsKey(Integer.valueOf(i15))) {
                    iIntValue = map.get(Integer.valueOf(i15)).intValue();
                }
            } else {
                iIntValue = i15;
            }
            List<Integer> listA = this.f119116e.a(iIntValue);
            if (listA != null) {
                int iIntValue2 = listA.get(0).intValue();
                if (iIntValue2 > 65535) {
                    z15 = true;
                }
                i0Var.a(iIntValue, new String(new int[]{iIntValue2}, 0, 1));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i0Var.f(byteArrayOutputStream);
        hp.h hVar = new hp.h(this.f119148h, (InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), bp.i.E3);
        if (z15 && this.f119148h.a0() < 1.5d) {
            this.f119148h.i1(1.5f);
        }
        this.f119150j.Z4(bp.i.Q8, hVar);
    }

    private boolean n(bp.d dVar) {
        o0 o0VarO1 = this.f119113b.o1();
        if (o0VarO1 == null) {
            c2.g("PdfBox-Android", "Font to be subset is set to vertical, but has no 'vhea' table");
            return false;
        }
        float fT = 1000.0f / this.f119113b.K().t();
        long jRound = Math.round(o0VarO1.k() * fT);
        long jRound2 = Math.round((-o0VarO1.j()) * fT);
        if (jRound == 880 && jRound2 == -1000) {
            return true;
        }
        bp.a aVar = new bp.a();
        aVar.A3(bp.h.g4(jRound));
        aVar.A3(bp.h.g4(jRound2));
        dVar.Y4(bp.i.U2, aVar);
        return true;
    }

    private void o(bp.d dVar) {
        if (n(dVar)) {
            int iZ = this.f119113b.Z();
            int[] iArr = new int[iZ * 4];
            so.o oVarI = this.f119113b.I();
            p0 p0VarS1 = this.f119113b.s1();
            so.r rVarM = this.f119113b.M();
            for (int i15 = 0; i15 < iZ; i15++) {
                so.k kVarJ = oVarI.j(i15);
                if (kVarJ == null) {
                    iArr[i15 * 4] = Integer.MIN_VALUE;
                } else {
                    int i16 = i15 * 4;
                    iArr[i16] = i15;
                    iArr[i16 + 1] = p0VarS1.j(i15);
                    iArr[i16 + 2] = rVarM.j(i15);
                    iArr[i16 + 3] = kVarJ.c() + p0VarS1.k(i15);
                }
            }
            dVar.Y4(bp.i.E9, u(iArr));
        }
    }

    private void p(TreeMap<Integer, Integer> treeMap) {
        float f15;
        p0 p0Var;
        if (n(this.f119151k)) {
            float fT = 1000.0f / this.f119113b.K().t();
            o0 o0VarO1 = this.f119113b.o1();
            p0 p0VarS1 = this.f119113b.s1();
            so.o oVarI = this.f119113b.I();
            so.r rVarM = this.f119113b.M();
            long jRound = Math.round(o0VarO1.k() * fT);
            long jRound2 = Math.round((-o0VarO1.j()) * fT);
            bp.a aVar = new bp.a();
            bp.a aVar2 = new bp.a();
            Iterator<Integer> it = treeMap.keySet().iterator();
            int i15 = PKIFailureInfo.systemUnavail;
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                so.k kVarJ = oVarI.j(iIntValue);
                if (kVarJ == null) {
                    f15 = fT;
                    p0Var = p0VarS1;
                } else {
                    long jRound3 = Math.round((kVarJ.c() + p0VarS1.k(iIntValue)) * fT);
                    f15 = fT;
                    p0Var = p0VarS1;
                    long jRound4 = Math.round((-p0VarS1.j(iIntValue)) * f15);
                    if (jRound3 != jRound || jRound4 != jRound2) {
                        if (i15 != iIntValue - 1) {
                            bp.a aVar3 = new bp.a();
                            aVar.A3(bp.h.g4(iIntValue));
                            aVar.A3(aVar3);
                            aVar2 = aVar3;
                        }
                        aVar2.A3(bp.h.g4(jRound4));
                        aVar2.A3(bp.h.g4(((long) Math.round(rVarM.j(iIntValue) * f15)) / 2));
                        aVar2.A3(bp.h.g4(jRound3));
                        oVarI = oVarI;
                        i15 = iIntValue;
                    }
                }
                fT = f15;
                p0VarS1 = p0Var;
            }
            this.f119151k.Y4(bp.i.E9, aVar);
        }
    }

    private void q(bp.d dVar) {
        int iZ = this.f119113b.Z();
        int[] iArr = new int[iZ * 2];
        so.r rVarM = this.f119113b.M();
        for (int i15 = 0; i15 < iZ; i15++) {
            int i16 = i15 * 2;
            iArr[i16] = i15;
            iArr[i16 + 1] = rVarM.j(i15);
        }
        dVar.Y4(bp.i.D9, v(iArr));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void r(TreeMap<Integer, Integer> treeMap) {
        float fT = 1000.0f / this.f119113b.K().t();
        bp.a aVar = new bp.a();
        bp.a aVar2 = new bp.a();
        Set<Integer> setKeySet = treeMap.keySet();
        so.r rVarM = this.f119113b.M();
        int i15 = PKIFailureInfo.systemUnavail;
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            long jRound = Math.round(rVarM.j(treeMap.get(num).intValue()) * fT);
            if (jRound != 1000) {
                if (i15 != iIntValue - 1) {
                    aVar2 = new bp.a();
                    aVar.A3(bp.h.g4(iIntValue));
                    aVar.A3(aVar2);
                }
                aVar2.A3(bp.h.g4(jRound));
                i15 = iIntValue;
            }
        }
        this.f119151k.Y4(bp.i.D9, aVar);
    }

    private bp.d s() {
        bp.d dVar = new bp.d();
        dVar.Y4(bp.i.f20732e9, bp.i.H3);
        dVar.Y4(bp.i.f20938y8, bp.i.f20804m1);
        dVar.d5(bp.i.f20897v0, this.f119114c.k());
        dVar.Y4(bp.i.f20833p1, w("Adobe", "Identity", 0));
        dVar.Y4(bp.i.J3, this.f119114c.D1());
        q(dVar);
        if (this.f119152l) {
            o(dVar);
        }
        dVar.Y4(bp.i.f20814n1, bp.i.f20847q4);
        return dVar;
    }

    private bp.a u(int[] iArr) {
        bp.a aVar;
        bp.a aVar2;
        int[] iArr2 = iArr;
        if (iArr2.length < 4) {
            throw new IllegalArgumentException("length of values must be >= 4");
        }
        float fT = 1000.0f / this.f119113b.K().t();
        long j15 = iArr2[0];
        long jRound = Math.round((-iArr2[1]) * fT);
        long jRound2 = Math.round((iArr2[2] * fT) / 2.0f);
        long jRound3 = Math.round(iArr2[3] * fT);
        bp.a aVar3 = new bp.a();
        bp.a aVar4 = new bp.a();
        aVar4.A3(bp.h.g4(j15));
        int i15 = 3;
        bp.a aVar5 = aVar3;
        long j16 = jRound3;
        long j17 = jRound2;
        b bVar = b.FIRST;
        long j18 = j15;
        long j19 = jRound;
        int i16 = 4;
        while (i16 < iArr2.length - 3) {
            long j25 = iArr2[i16];
            if (j25 != -2147483648L) {
                long jRound4 = Math.round((-iArr2[i16 + 1]) * fT);
                long jRound5 = Math.round((iArr[i16 + 2] * fT) / 2.0f);
                long jRound6 = Math.round(iArr[i16 + 3] * fT);
                int i17 = a.f119153a[bVar.ordinal()];
                if (i17 == 1) {
                    aVar = aVar5;
                    long j26 = j18 + 1;
                    if (j25 == j26 && jRound4 == j19 && jRound5 == j17 && jRound6 == j16) {
                        bVar = b.SERIAL;
                        aVar5 = aVar;
                    } else {
                        if (j25 == j26) {
                            bVar = b.BRACKET;
                            aVar2 = new bp.a();
                            aVar2.A3(bp.h.g4(j19));
                            aVar2.A3(bp.h.g4(j17));
                            aVar2.A3(bp.h.g4(j16));
                        } else {
                            aVar2 = new bp.a();
                            aVar2.A3(bp.h.g4(j19));
                            aVar2.A3(bp.h.g4(j17));
                            aVar2.A3(bp.h.g4(j16));
                            aVar4.A3(aVar2);
                            aVar4.A3(bp.h.g4(j25));
                        }
                        aVar5 = aVar2;
                    }
                } else if (i17 == 2) {
                    long j27 = j18 + 1;
                    if (j25 == j27 && jRound4 == j19 && jRound5 == j17 && jRound6 == j16) {
                        bVar = b.SERIAL;
                        aVar4.A3(aVar5);
                        aVar4.A3(bp.h.g4(j18));
                    } else {
                        aVar = aVar5;
                        if (j25 == j27) {
                            aVar.A3(bp.h.g4(j19));
                            aVar.A3(bp.h.g4(j17));
                            aVar.A3(bp.h.g4(j16));
                        } else {
                            bVar = b.FIRST;
                            aVar.A3(bp.h.g4(j19));
                            aVar.A3(bp.h.g4(j17));
                            aVar.A3(bp.h.g4(j16));
                            aVar4.A3(aVar);
                            aVar4.A3(bp.h.g4(j25));
                        }
                        aVar5 = aVar;
                    }
                } else if (i17 == i15 && !(j25 == j18 + 1 && jRound4 == j19 && jRound5 == j17 && jRound6 == j16)) {
                    aVar4.A3(bp.h.g4(j18));
                    aVar4.A3(bp.h.g4(j19));
                    aVar4.A3(bp.h.g4(j17));
                    aVar4.A3(bp.h.g4(j16));
                    aVar4.A3(bp.h.g4(j25));
                    bVar = b.FIRST;
                } else {
                    aVar = aVar5;
                    aVar5 = aVar;
                }
                j18 = j25;
                j19 = jRound4;
                j17 = jRound5;
                j16 = jRound6;
            }
            i16 += 4;
            iArr2 = iArr;
            i15 = 3;
        }
        bp.a aVar6 = aVar5;
        int i18 = a.f119153a[bVar.ordinal()];
        if (i18 == 1) {
            bp.a aVar7 = new bp.a();
            aVar7.A3(bp.h.g4(j19));
            aVar7.A3(bp.h.g4(j17));
            aVar7.A3(bp.h.g4(j16));
            aVar4.A3(aVar7);
            return aVar4;
        }
        if (i18 == 2) {
            aVar6.A3(bp.h.g4(j19));
            aVar6.A3(bp.h.g4(j17));
            aVar6.A3(bp.h.g4(j16));
            aVar4.A3(aVar6);
            return aVar4;
        }
        if (i18 != 3) {
            return aVar4;
        }
        aVar4.A3(bp.h.g4(j18));
        aVar4.A3(bp.h.g4(j19));
        aVar4.A3(bp.h.g4(j17));
        aVar4.A3(bp.h.g4(j16));
        return aVar4;
    }

    private bp.a v(int[] iArr) {
        b bVar;
        int[] iArr2 = iArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("length of widths must be >= 2");
        }
        float fT = 1000.0f / this.f119113b.K().t();
        long j15 = iArr2[0];
        long jRound = Math.round(iArr2[1] * fT);
        bp.a aVar = new bp.a();
        bp.a aVar2 = new bp.a();
        aVar2.A3(bp.h.g4(j15));
        b bVar2 = b.FIRST;
        int i15 = 2;
        for (int i16 = 1; i15 < iArr2.length - i16; i16 = 1) {
            long j16 = iArr2[i15];
            long jRound2 = Math.round(iArr2[i15 + 1] * fT);
            int i17 = a.f119153a[bVar2.ordinal()];
            if (i17 == 1) {
                long j17 = j15 + 1;
                if (j16 == j17 && jRound2 == jRound) {
                    bVar = b.SERIAL;
                    bVar2 = bVar;
                } else if (j16 == j17) {
                    b bVar3 = b.BRACKET;
                    bp.a aVar3 = new bp.a();
                    aVar3.A3(bp.h.g4(jRound));
                    bVar2 = bVar3;
                    aVar = aVar3;
                } else {
                    bp.a aVar4 = new bp.a();
                    aVar4.A3(bp.h.g4(jRound));
                    aVar2.A3(aVar4);
                    aVar2.A3(bp.h.g4(j16));
                    aVar = aVar4;
                }
            } else if (i17 == 2) {
                long j18 = j15 + 1;
                if (j16 == j18 && jRound2 == jRound) {
                    bVar = b.SERIAL;
                    aVar2.A3(aVar);
                    aVar2.A3(bp.h.g4(j15));
                } else if (j16 == j18) {
                    aVar.A3(bp.h.g4(jRound));
                } else {
                    bVar = b.FIRST;
                    aVar.A3(bp.h.g4(jRound));
                    aVar2.A3(aVar);
                    aVar2.A3(bp.h.g4(j16));
                }
                bVar2 = bVar;
            } else if (i17 == 3 && (j16 != j15 + 1 || jRound2 != jRound)) {
                aVar2.A3(bp.h.g4(j15));
                aVar2.A3(bp.h.g4(jRound));
                aVar2.A3(bp.h.g4(j16));
                bVar = b.FIRST;
                bVar2 = bVar;
            }
            i15 += 2;
            iArr2 = iArr;
            jRound = jRound2;
            j15 = j16;
        }
        int i18 = a.f119153a[bVar2.ordinal()];
        if (i18 == 1) {
            bp.a aVar5 = new bp.a();
            aVar5.A3(bp.h.g4(jRound));
            aVar2.A3(aVar5);
            return aVar2;
        }
        if (i18 == 2) {
            aVar.A3(bp.h.g4(jRound));
            aVar2.A3(aVar);
            return aVar2;
        }
        if (i18 != 3) {
            return aVar2;
        }
        aVar2.A3(bp.h.g4(j15));
        aVar2.A3(bp.h.g4(jRound));
        return aVar2;
    }

    private bp.d w(String str, String str2, int i15) {
        bp.d dVar = new bp.d();
        dVar.g5(bp.i.f20915w7, str);
        dVar.g5(bp.i.f20871s6, str2);
        dVar.W4(bp.i.f20949z8, i15);
        return dVar;
    }

    @Override // lp.j0
    protected void c(InputStream inputStream, String str, Map<Integer, Integer> map) throws Throwable {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            key.intValue();
            Integer value = entry.getValue();
            value.intValue();
            treeMap.put(value, key);
        }
        m(map);
        if (this.f119152l) {
            p(treeMap);
        }
        b(inputStream);
        j(str);
        r(treeMap);
        l(treeMap);
        k(treeMap);
    }

    public m t() {
        return new o(this.f119151k, this.f119149i, this.f119113b);
    }
}
