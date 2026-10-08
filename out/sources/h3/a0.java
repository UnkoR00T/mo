package h3;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import n4.c0;
import n4.h0;
import oq.i0;
import p071kotlin.Metadata;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/ViewStructure;", "Ln4/r;", "semanticsInfo", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "", "packageName", "Lo4/d;", "rectManager", "Loq/i0;", "a", "(Landroid/view/ViewStructure;Ln4/r;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lo4/d;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "Loq/i0;", "c", "(IIII)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.r<Integer, Integer, Integer, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f80218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewStructure f80219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, ViewStructure viewStructure) {
            super(4);
            this.f80218b = jVar;
            this.f80219c = viewStructure;
        }

        public final void c(int i15, int i16, int i17, int i18) {
            this.f80218b.s(this.f80219c, i15, i16, 0, 0, i17 - i15, i18 - i16);
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0253  */
    /* JADX WARN: Code duplicated, block: B:157:0x033c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0345  */
    /* JADX WARN: Code duplicated, block: B:165:0x034f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0351  */
    /* JADX WARN: Code duplicated, block: B:169:0x0358  */
    /* JADX WARN: Code duplicated, block: B:171:0x0365 A[LOOP:4: B:170:0x0363->B:171:0x0365, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x01a6 A[EDGE_INSN: B:188:0x01a6->B:72:0x01a6 BREAK  A[LOOP:0: B:9:0x0046->B:70:0x0181], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x017f A[DONT_INVERT, PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29 r30 r31
      0x017f: PHI (r21v6 h3.s) = (r21v5 h3.s), (r21v7 h3.s) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r23v11 p4.a) = (r23v10 p4.a), (r23v12 p4.a) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r24v6 q4.e) = (r24v5 q4.e), (r24v7 q4.e) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r25v6 h3.h) = (r25v5 h3.h), (r25v7 h3.h) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r26v6 h3.u) = (r26v5 h3.u), (r26v7 h3.u) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r27v6 java.lang.Boolean) = (r27v5 java.lang.Boolean), (r27v7 java.lang.Boolean) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r28v6 n4.l) = (r28v5 n4.l), (r28v7 n4.l) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r29v6 boolean) = (r29v5 boolean), (r29v7 boolean) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r30v6 boolean) = (r30v5 boolean), (r30v7 boolean) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r31v6 java.lang.Integer) = (r31v5 java.lang.Integer), (r31v7 java.lang.Integer) binds: [B:10:0x0050, B:68:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0181 A[LOOP:0: B:9:0x0046->B:70:0x0181, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:171:0x0365, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(ViewStructure viewStructure, n4.r rVar, AutofillId autofillId, String str, o4.d dVar) {
        int i15;
        long j15;
        char c15;
        long j16;
        boolean zBooleanValue;
        p4.a aVar;
        s sVar;
        boolean z15;
        q4.e eVar;
        h hVar;
        u uVar;
        Boolean bool;
        n4.l lVar;
        boolean z16;
        Integer num;
        int i16;
        List list;
        Integer numValueOf;
        boolean z17;
        boolean z18;
        boolean z19;
        int i17;
        String strE;
        int size;
        String str2;
        int i18;
        String[] strArrB;
        String[] strArrB2;
        t0<h0<?>, Object> t0VarQ;
        c0 c0Var;
        c0 c0Var2;
        int i19;
        t0<h0<?>, Object> t0VarQ2;
        p4.a aVar2;
        int i25;
        j jVar = j.f80238a;
        c0 c0Var3 = c0.f131174a;
        n4.p pVar = n4.p.f131279a;
        SemanticsConfiguration semanticsConfigurationF = rVar.f();
        int i26 = 8;
        int i27 = 1;
        if (semanticsConfigurationF == null || (t0VarQ2 = semanticsConfigurationF.q()) == null) {
            i15 = 2;
            j15 = 255;
            c15 = 7;
            j16 = -9187201950435737472L;
            zBooleanValue = true;
            aVar = null;
            sVar = null;
            z15 = false;
            eVar = null;
            hVar = null;
            uVar = null;
            bool = null;
            lVar = null;
            z16 = false;
            num = null;
        } else {
            Object[] objArr = t0VarQ2.keys;
            j15 = 255;
            Object[] objArr2 = t0VarQ2.values;
            long[] jArr = t0VarQ2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                i15 = 2;
                int i28 = 0;
                c15 = 7;
                sVar = null;
                z15 = false;
                aVar2 = null;
                eVar = null;
                hVar = null;
                uVar = null;
                bool = null;
                lVar = null;
                z16 = false;
                num = null;
                j16 = -9187201950435737472L;
                while (true) {
                    long j17 = jArr[i28];
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i29 = 8 - ((~(i28 - length)) >>> 31);
                        int i35 = 0;
                        while (i35 < i29) {
                            if ((j17 & 255) < 128) {
                                int i36 = (i28 << 3) + i35;
                                Object obj = objArr[i36];
                                Object obj2 = objArr2[i36];
                                h0 h0Var = (h0) obj;
                                i25 = i26;
                                if (fr.t.c(h0Var, c0Var3.c())) {
                                    sVar = (s) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.d())) {
                                    CharSequence charSequence = (String) pq.v.n0((List) obj2);
                                    if (charSequence != null) {
                                        jVar.q(viewStructure, charSequence);
                                    }
                                } else if (fr.t.c(h0Var, c0Var3.e())) {
                                    uVar = (u) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.i())) {
                                    hVar = (h) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.g())) {
                                    eVar = (q4.e) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.j())) {
                                    jVar.v(viewStructure, ((Boolean) obj2).booleanValue());
                                } else if (fr.t.c(h0Var, c0Var3.B())) {
                                    num = (Integer) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.D())) {
                                    z16 = true;
                                } else if (fr.t.c(h0Var, c0Var3.w())) {
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (fr.t.c(h0Var, c0Var3.F())) {
                                    lVar = (n4.l) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.H())) {
                                    bool = (Boolean) obj2;
                                } else if (fr.t.c(h0Var, c0Var3.Q())) {
                                    aVar2 = (p4.a) obj2;
                                } else if (fr.t.c(h0Var, pVar.l())) {
                                    jVar.p(viewStructure, true);
                                } else if (fr.t.c(h0Var, pVar.o())) {
                                    jVar.y(viewStructure, true);
                                } else if (fr.t.c(h0Var, pVar.u())) {
                                    jVar.u(viewStructure, true);
                                } else if (fr.t.c(h0Var, pVar.A())) {
                                    z15 = true;
                                }
                            } else {
                                i25 = i26;
                            }
                            j17 >>= i25;
                            i35++;
                            i26 = i25;
                        }
                        if (i29 != i26) {
                            break;
                        }
                        if (i28 != length) {
                            break;
                        }
                        i28++;
                        i26 = 8;
                    } else if (i28 != length) {
                        break;
                        break;
                    } else {
                        i28++;
                        i26 = 8;
                    }
                }
            } else {
                i15 = 2;
                c15 = 7;
                j16 = -9187201950435737472L;
                zBooleanValue = true;
                sVar = null;
                z15 = false;
                aVar2 = null;
                eVar = null;
                hVar = null;
                uVar = null;
                bool = null;
                lVar = null;
                z16 = false;
                num = null;
            }
            aVar = aVar2;
        }
        SemanticsConfiguration semanticsConfigurationA = n4.s.a(rVar);
        if (semanticsConfigurationA == null || (t0VarQ = semanticsConfigurationA.q()) == null) {
            i16 = 1;
            list = null;
        } else {
            Object[] objArr3 = t0VarQ.keys;
            Object[] objArr4 = t0VarQ.values;
            long[] jArr2 = t0VarQ.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i37 = 0;
                list = null;
                while (true) {
                    long j18 = jArr2[i37];
                    if ((((~j18) << c15) & j18 & j16) != j16) {
                        int i38 = 8 - ((~(i37 - length2)) >>> 31);
                        int i39 = 0;
                        while (i39 < i38) {
                            if ((j18 & j15) < 128) {
                                int i45 = (i37 << 3) + i39;
                                Object obj3 = objArr3[i45];
                                Object obj4 = objArr4[i45];
                                i19 = i27;
                                h0 h0Var2 = (h0) obj3;
                                c0Var2 = c0Var3;
                                if (fr.t.c(h0Var2, c0Var2.f())) {
                                    jVar.t(viewStructure, false);
                                } else if (fr.t.c(h0Var2, c0Var2.L())) {
                                    list = (List) obj4;
                                }
                            } else {
                                c0Var2 = c0Var3;
                                i19 = i27;
                            }
                            j18 >>= 8;
                            i39++;
                            c0Var3 = c0Var2;
                            i27 = i19;
                        }
                        c0Var = c0Var3;
                        i16 = i27;
                        if (i38 != 8) {
                            break;
                        }
                    } else {
                        c0Var = c0Var3;
                        i16 = i27;
                    }
                    if (i37 == length2) {
                        break;
                    }
                    i37++;
                    c0Var3 = c0Var;
                    i27 = i16;
                }
            } else {
                i16 = 1;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(rVar.getSemanticsId());
        if (rVar.h() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        jVar.j(viewStructure, autofillId, iIntValue);
        jVar.w(viewStructure, iIntValue, str, null, null);
        if (sVar != null) {
            numValueOf = Integer.valueOf(t.b(sVar));
        } else if (z15) {
            numValueOf = Integer.valueOf(i16);
        } else {
            numValueOf = aVar != null ? Integer.valueOf(i15) : null;
        }
        if (numValueOf != null) {
            jVar.k(viewStructure, numValueOf.intValue());
        }
        if (eVar != null) {
            jVar.l(viewStructure, jVar.b(eVar.getText()));
        }
        if (hVar != null) {
            jVar.l(viewStructure, hVar.getAutofillValue());
        }
        if (uVar != null && (strArrB2 = v.b(uVar)) != null) {
            jVar.i(viewStructure, strArrB2);
        }
        dVar.getRects().q(rVar.getSemanticsId(), new a(jVar, viewStructure));
        if (bool != null) {
            jVar.z(viewStructure, bool.booleanValue());
        }
        if (aVar != null) {
            jVar.m(viewStructure, i16);
            jVar.n(viewStructure, aVar == p4.a.On);
        } else if (bool != null) {
            if (!(lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.h()))) {
                jVar.m(viewStructure, true);
                jVar.n(viewStructure, bool.booleanValue());
            }
        }
        String str3 = (String) pq.n.n0(v.b(u.INSTANCE.b()));
        if (uVar != null && (strArrB = v.b(uVar)) != null) {
            boolean zF0 = pq.n.f0(strArrB, str3);
            z17 = true;
            boolean z25 = zF0;
            if (!z16 || z25) {
                z18 = z17;
            } else {
                z18 = false;
            }
            if (!z18 || zBooleanValue) {
                z19 = z17;
            } else {
                z19 = false;
            }
            jVar.r(viewStructure, z19);
            if (rVar.t()) {
                i17 = 4;
            } else {
                i17 = 0;
            }
            jVar.B(viewStructure, i17);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i18 = 0; i18 < size; i18++) {
                    str2 = str2 + ((q4.e) list.get(i18)).getText() + '\n';
                }
                jVar.A(viewStructure, str2);
                jVar.o(viewStructure, "android.widget.TextView");
            }
            if (rVar.r().isEmpty() && lVar != null && (strE = p2.e(lVar.getValue())) != null) {
                jVar.o(viewStructure, strE);
            }
            if (z15) {
                jVar.o(viewStructure, "android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    l.f80240a.a(viewStructure, num.intValue());
                }
                if (z18) {
                    jVar.x(viewStructure, 129);
                }
            }
        }
        z17 = true;
        if (z16) {
            z18 = z17;
        } else {
            z18 = z17;
        }
        if (z18) {
            z19 = z17;
        } else {
            z19 = z17;
        }
        jVar.r(viewStructure, z19);
        if (rVar.t()) {
            i17 = 4;
        } else {
            i17 = 0;
        }
        jVar.B(viewStructure, i17);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i18 < size) {
                str2 = str2 + ((q4.e) list.get(i18)).getText() + '\n';
            }
            jVar.A(viewStructure, str2);
            jVar.o(viewStructure, "android.widget.TextView");
        }
        if (rVar.r().isEmpty()) {
            jVar.o(viewStructure, strE);
        }
        if (z15) {
            jVar.o(viewStructure, "android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                l.f80240a.a(viewStructure, num.intValue());
            }
            if (z18) {
                jVar.x(viewStructure, 129);
            }
        }
    }
}
