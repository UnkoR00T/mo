package p076m2;

import e3.f;
import er.p;
import java.util.ArrayList;
import java.util.List;
import n2.g;
import o2.e;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p2.SlotWriter;
import p2.c;
import p2.d;
import p2.l;
import pq.v;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0014\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001eH\u0000¢\u0006\u0004\b!\u0010\"\"\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\" \u00100\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\b/\u0010\r\u001a\u0004\b-\u0010.\" \u00103\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010,\u0012\u0004\b2\u0010\r\u001a\u0004\b1\u0010.\" \u00106\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010,\u0012\u0004\b5\u0010\r\u001a\u0004\b4\u0010.\" \u00109\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010,\u0012\u0004\b8\u0010\r\u001a\u0004\b7\u0010.\" \u0010<\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u0010,\u0012\u0004\b;\u0010\r\u001a\u0004\b:\u0010.\" \u0010\u001c\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b-\u0010,\u0012\u0004\b>\u0010\r\u001a\u0004\b=\u0010.¨\u0006?"}, d2 = {"", "k", "()Z", "", "key", "dirty1", "dirty2", "", "info", "Loq/i0;", "o", "(IIILjava/lang/String;)V", "n", "()V", "Lp2/o;", "Lo2/e;", "rememberManager", "l", "(Lp2/o;Lo2/e;)V", "message", "", "c", "(Ljava/lang/String;)Ljava/lang/Void;", "b", "(Ljava/lang/String;)V", "Lm2/l0;", "composition", "Lm2/s2;", "reference", "slots", "Lm2/c;", "applier", "Lm2/r2;", "d", "(Lm2/l0;Lm2/s2;Lp2/o;Lm2/c;)Lm2/r2;", "Le3/f;", "a", "I", "e", "()I", "setComposeStackTraceMode-76WK1J0", "(I)V", "composeStackTraceMode", "", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "h", "getProvider$annotations", "provider", "f", "getCompositionLocalMap$annotations", "compositionLocalMap", "getProviderValues", "getProviderValues$annotations", "providerValues", "i", "getProviderMaps$annotations", "providerMaps", "j", "getReference$annotations", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f123152a = f.INSTANCE.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f123153b = new OpaqueKey("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f123154c = new OpaqueKey("provider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f123155d = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f123156e = new OpaqueKey("providerValues");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f123157f = new OpaqueKey("providers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f123158g = new OpaqueKey("reference");

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"m2/t$a", "Lm2/h4;", "Lm2/f4;", "scope", "", "instance", "Lm2/s1;", "i", "(Lm2/f4;Ljava/lang/Object;)Lm2/s1;", "Loq/i0;", "g", "(Lm2/f4;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f123159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s2 f123160b;

        a(l0 l0Var, s2 s2Var) {
            this.f123159a = l0Var;
            this.f123160b = s2Var;
        }

        @Override // p076m2.h4
        public void a(Object value) {
        }

        @Override // p076m2.h4
        public void g(f4 scope) {
        }

        @Override // p076m2.h4
        public s1 i(f4 scope, Object instance) {
            s1 s1VarI;
            l0 l0Var = this.f123159a;
            h4 h4Var = l0Var instanceof h4 ? (h4) l0Var : null;
            if (h4Var == null || (s1VarI = h4Var.i(scope, instance)) == null) {
                s1VarI = s1.IGNORED;
            }
            if (s1VarI != s1.IGNORED) {
                return s1VarI;
            }
            s2 s2Var = this.f123160b;
            s2Var.i(v.M0(s2Var.d(), y.a(scope, instance)));
            return s1.SCHEDULED;
        }
    }

    public static final void b(String str) {
        throw new p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void c(String str) {
        throw new p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final r2 d(l0 l0Var, s2 s2Var, SlotWriter slotWriter, c<?> cVar) {
        s2 s2Var2;
        l lVar;
        List listN;
        b bVar;
        long[] jArr;
        b bVar2;
        l lVar2;
        long[] jArr2;
        long j15;
        int i15;
        boolean zE;
        Object obj;
        int i16;
        long j16;
        Object obj2;
        l lVar3 = new l();
        if (slotWriter.b0()) {
            lVar3.g();
        }
        if (slotWriter.a0()) {
            lVar3.f();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (cVar != null && slotWriter.J0(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.w0(parent)) {
                parent = slotWriter.L0(parent);
            }
            if (parent >= 0 && slotWriter.w0(parent)) {
                Object objH0 = slotWriter.H0(parent);
                int i17 = parent + 1;
                int iL0 = parent + slotWriter.l0(parent);
                int iJ0 = 0;
                while (i17 < iL0) {
                    int iL1 = slotWriter.l0(i17) + i17;
                    if (iL1 > currentGroup) {
                        break;
                    }
                    iJ0 += slotWriter.w0(i17) ? 1 : slotWriter.J0(i17);
                    i17 = iL1;
                }
                int iJ1 = slotWriter.w0(currentGroup) ? 1 : slotWriter.J0(currentGroup);
                cVar.g(objH0);
                cVar.b(iJ0, iJ1);
                cVar.j();
            }
        }
        b bVarA = s2Var.getAnchor();
        if (bVarA.a()) {
            x xVar = (x) l0Var;
            if (g.i(xVar.invalidations) > 0) {
                listN = new ArrayList();
                t0 t0Var = xVar.invalidations;
                long[] jArr3 = t0Var.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j17 = jArr3[i18];
                        if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8;
                            int i25 = 8 - ((~(i18 - length)) >>> 31);
                            int i26 = 0;
                            while (i26 < i25) {
                                if ((j17 & 255) < 128) {
                                    int i27 = (i18 << 3) + i26;
                                    int i28 = i19;
                                    Object obj3 = t0Var.keys[i27];
                                    bVar2 = bVarA;
                                    Object obj4 = t0Var.values[i27];
                                    if (obj4 instanceof u0) {
                                        u0 u0Var = (u0) obj4;
                                        Object[] objArr = u0Var.elements;
                                        long[] jArr4 = u0Var.metadata;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j15 = j17;
                                            int i29 = 0;
                                            while (true) {
                                                long j18 = jArr4[i29];
                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i35 = 8 - ((~(i29 - length2)) >>> 31);
                                                    int i36 = 0;
                                                    while (i36 < i35) {
                                                        if ((j18 & 255) < 128) {
                                                            i16 = i36;
                                                            int i37 = (i29 << 3) + i16;
                                                            j16 = j18;
                                                            Object obj5 = objArr[i37];
                                                            f4 f4Var = (f4) obj3;
                                                            b bVarH = f4Var.getAnchor();
                                                            if (bVarH != null) {
                                                                obj2 = obj3;
                                                                lVar3 = lVar3;
                                                                if (slotWriter.o0(d.a(bVar2), d.a(bVarH))) {
                                                                    listN.add(y.a(f4Var, obj5));
                                                                    u0Var.B(i37);
                                                                }
                                                            }
                                                            j18 = j16 >> i28;
                                                            i36 = i16 + 1;
                                                            obj3 = obj2;
                                                            lVar3 = lVar3;
                                                        } else {
                                                            i16 = i36;
                                                            j16 = j18;
                                                        }
                                                        obj2 = obj3;
                                                        j18 = j16 >> i28;
                                                        i36 = i16 + 1;
                                                        obj3 = obj2;
                                                        lVar3 = lVar3;
                                                    }
                                                    lVar2 = lVar3;
                                                    obj = obj3;
                                                    if (i35 != i28) {
                                                        break;
                                                    }
                                                } else {
                                                    lVar2 = lVar3;
                                                    obj = obj3;
                                                }
                                                if (i29 == length2) {
                                                    break;
                                                }
                                                i29++;
                                                obj3 = obj;
                                                lVar3 = lVar2;
                                                i28 = 8;
                                            }
                                        } else {
                                            lVar2 = lVar3;
                                            j15 = j17;
                                        }
                                        zE = u0Var.e();
                                    } else {
                                        lVar2 = lVar3;
                                        jArr2 = jArr3;
                                        j15 = j17;
                                        f4 f4Var2 = (f4) obj3;
                                        b bVarH2 = f4Var2.getAnchor();
                                        if (bVarH2 == null || !slotWriter.o0(d.a(bVar2), d.a(bVarH2))) {
                                            zE = false;
                                        } else {
                                            listN.add(y.a(f4Var2, obj4));
                                            zE = true;
                                        }
                                    }
                                    if (zE) {
                                        t0Var.v(i27);
                                    }
                                    i15 = 8;
                                } else {
                                    bVar2 = bVarA;
                                    lVar2 = lVar3;
                                    jArr2 = jArr3;
                                    j15 = j17;
                                    i15 = i19;
                                }
                                j17 = j15 >> i15;
                                i26++;
                                i19 = i15;
                                bVarA = bVar2;
                                jArr3 = jArr2;
                                lVar3 = lVar2;
                            }
                            bVar = bVarA;
                            lVar = lVar3;
                            jArr = jArr3;
                            if (i25 != i19) {
                                break;
                            }
                        } else {
                            bVar = bVarA;
                            lVar = lVar3;
                            jArr = jArr3;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18++;
                        bVarA = bVar;
                        jArr3 = jArr;
                        lVar3 = lVar;
                    }
                } else {
                    lVar = lVar3;
                }
            } else {
                lVar = lVar3;
                listN = v.n();
            }
            s2Var2 = s2Var;
            s2Var2.i(v.L0(s2Var.d(), listN));
        } else {
            s2Var2 = s2Var;
            lVar = lVar3;
        }
        SlotWriter slotWriterV = lVar.V();
        try {
            slotWriterV.F();
            slotWriterV.n1(126665345, s2Var2.c());
            SlotWriter.z0(slotWriterV, 0, 1, null);
            slotWriterV.s1(s2Var2.getParameter());
            List<c> listG0 = slotWriter.G0(d.a(s2Var2.getAnchor()), 1, slotWriterV);
            slotWriterV.c1();
            slotWriterV.S();
            slotWriterV.T();
            slotWriterV.K(true);
            l lVar4 = lVar;
            r2 r2Var = new r2(lVar4);
            f4.Companion aVar = f4.INSTANCE;
            if (!aVar.b(lVar4, listG0)) {
                return r2Var;
            }
            a aVar2 = new a(l0Var, s2Var2);
            SlotWriter slotWriterV2 = lVar4.V();
            try {
                aVar.a(slotWriterV2, listG0, aVar2);
                i0 i0Var = i0.f148189a;
                boolean z15 = true;
                return r2Var;
            } finally {
                slotWriterV2.K(false);
            }
        } catch (Throwable th4) {
            slotWriterV.K(false);
            throw th4;
        }
    }

    public static final int e() {
        return f123152a;
    }

    public static final Object f() {
        return f123155d;
    }

    public static final Object g() {
        return f123153b;
    }

    public static final Object h() {
        return f123154c;
    }

    public static final Object i() {
        return f123157f;
    }

    public static final Object j() {
        return f123158g;
    }

    public static final boolean k() {
        return false;
    }

    public static final void l(SlotWriter slotWriter, final e eVar) {
        slotWriter.X(slotWriter.getCurrentGroup(), new p() { // from class: m2.s
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return t.m(eVar, ((Integer) obj).intValue(), obj2);
            }
        });
        slotWriter.S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e eVar, int i15, Object obj) {
        if (obj instanceof n) {
            eVar.a((n) obj);
        }
        if (obj instanceof v4) {
            eVar.c((v4) obj);
        }
        if (obj instanceof f4) {
            ((f4) obj).A();
        }
        return i0.f148189a;
    }

    public static final void n() {
    }

    public static final void o(int i15, int i16, int i17, String str) {
    }
}
