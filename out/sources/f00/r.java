package f00;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.g1;
import p136y9.s1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aW\u0010\u001a\u001a\u00020\b\"\u0012\b\u0000\u0010\u0015*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0001\u0010\u0017*\u00020\u0016*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ai\u0010\u001f\u001a\u00020\b\"\b\b\u0000\u0010\u0017*\u00020\u0016\"\b\b\u0001\u0010\u001c*\u00020\u0016\"\u0014\b\u0002\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001d*\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a¡\u0001\u0010'\u001a\u00020\b\"\u0018\b\u0000\u0010\"*\u00020!*\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\u001d\"\u000e\b\u0001\u0010$*\b\u0012\u0004\u0012\u00028\u00000#\"\b\b\u0002\u0010\u0017*\u00020\u0016\"\b\b\u0003\u0010\u001c*\u00020\u0016\"\u0014\b\u0004\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\u001d*\u00020\u00072\u0006\u0010%\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b'\u0010(\u001a\u008d\u0001\u0010)\u001a\u00020\b\"\u0018\b\u0000\u0010\"*\u00020!*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u001d\"\u000e\b\u0001\u0010$*\b\u0012\u0004\u0012\u00028\u00000#\"\b\b\u0002\u0010\u001c*\u00020\u0016\"\u0014\b\u0003\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u001d*\u00020\u00072\u0006\u0010%\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b)\u0010*\u001a'\u0010,\u001a\u00020+\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Ly9/d1;", "Lzx/a;", "destination", "Lf00/g0;", "navigationType", "Lkotlin/Function2;", "Lt0/f;", "Ly9/w;", "Loq/i0;", "content", "t", "(Ly9/d1;Lzx/a;Lf00/g0;Ler/r;)V", "Lf00/t;", "dialogDestinationType", "Lkotlin/Function1;", "B", "(Ly9/d1;Lzx/a;Lf00/t;Ler/q;)V", "Lf00/s;", "J", "(Lf00/g0;Lm2/r;II)Lf00/s;", "Lzx/b;", "T", "", "DATA", "data", "resultNavigation", ip.a.f96138c, "(Ly9/w;Lzx/a;Ljava/lang/Object;Ler/q;Lm2/r;I)V", "ACTION", "Lzx/d;", "Lzx/c;", "r", "(Ly9/w;Lzx/c;Ljava/lang/Object;Ler/q;Lm2/r;I)V", "Landroidx/lifecycle/t0;", "VM", "Lmr/c;", "CLASS", "vmClass", "screen", "o", "(Ly9/w;Lmr/c;Ljava/lang/Object;Ler/q;Ler/q;Lm2/r;I)V", "n", "(Ly9/w;Lmr/c;Ler/q;Ler/q;Lm2/r;I)V", "Lp7/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ly9/w;Ljava/lang/Object;)Lp7/a;", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "Landroidx/lifecycle/w0$c;", "G", "(Landroidx/lifecycle/y0;Lm2/r;I)Landroidx/lifecycle/w0$c;", "", "Lf00/i0;", "a", "Ljava/util/List;", "K", "()Ljava/util/List;", "sharedDestinationRegistry", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<SharedDestinationSpec> f54561a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(er.r rVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar2, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1235567062, i15, -1, "pl.gov.coi.common.navigation.addDestination.<anonymous>.<anonymous> (Destination.kt:83)");
        }
        rVar.g(fVar, wVar, rVar2, Integer.valueOf(i15 & 126));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    @oq.a
    public static final void B(d1 d1Var, zx.a aVar, t tVar, final er.q<? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> qVar) {
        z9.t.c(d1Var, aVar.getRoute(), pq.v.n(), pq.v.n(), tVar.getDialogProperties(), y2.m.b(-938827054, true, new er.q() { // from class: f00.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r.C(qVar, (p136y9.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(er.q qVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-938827054, i15, -1, "pl.gov.coi.common.navigation.addDialogDestination.<anonymous> (Destination.kt:106)");
        }
        qVar.w(wVar, rVar, Integer.valueOf(i15 & 14));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oq.a
    public static final <T extends zx.b<?, DATA>, DATA> void D(final p136y9.w wVar, final zx.a aVar, final DATA data, final er.q<? super T, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15) {
        int i16;
        CreationExtras creationExtrasX;
        p136y9.w wVar2 = wVar;
        p076m2.r rVarH = rVar.h(2069513864);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(wVar2) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(data) : rVarH.G(data) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        int i17 = i16;
        boolean z15 = true;
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2069513864, i17, -1, "pl.gov.coi.common.navigation.createDestination (Destination.kt:156)");
            }
            Iterator<T> it = f54561a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                SharedDestinationSpec i0Var = (SharedDestinationSpec) it.next();
                if (i0Var.a().isInstance(aVar)) {
                    Class<? extends t0> clsC = i0Var.c();
                    w0.c cVarG = G(wVar2, rVarH, i17 & 14);
                    if (data == null) {
                        rVarH.X(-1367581870);
                        rVarH.R();
                        creationExtrasX = wVar2.x();
                    } else {
                        rVarH.X(-1367529201);
                        p7.d dVar = (p7.d) wVar2.x();
                        CreationExtras.c<er.l<Object, t0>> cVar = hq.c.f86279e;
                        if ((i17 & 896) != 256 && ((i17 & 512) == 0 || !rVarH.G(data))) {
                            z15 = false;
                        }
                        Object objE = rVarH.E();
                        if (z15 || objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.l() { // from class: f00.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return r.E(data, obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        dVar.c(cVar, (er.l) objE);
                        rVarH.R();
                        creationExtrasX = dVar;
                    }
                    Object objB = q7.d.b(clsC, wVar2, null, cVarG, creationExtrasX, rVarH, (i17 << 3) & 112, 4);
                    if (data != null) {
                        ((zx.b) objB).P5(data);
                    }
                    qVar.w((zx.b) objB, rVarH, Integer.valueOf((i17 >> 6) & 112));
                    i0Var.b().w(objB, rVarH, 0);
                    if (!p076m2.t.k()) {
                        break;
                    }
                    p076m2.t.n();
                    break;
                }
                wVar2 = wVar;
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.F(wVar, aVar, data, qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 E(Object obj, Object obj2) {
        return ((j0) obj2).a(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(p136y9.w wVar, zx.a aVar, Object obj, er.q qVar, int i15, p076m2.r rVar, int i16) {
        D(wVar, aVar, obj, qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final w0.c G(y0 y0Var, p076m2.r rVar, int i15) {
        w0.c cVarA;
        if (p076m2.t.k()) {
            p076m2.t.o(1242263431, i15, -1, "pl.gov.coi.common.navigation.createHiltViewModelFactory (Destination.kt:277)");
        }
        if (y0Var instanceof androidx.p016lifecycle.h) {
            rVar.X(-1463142675);
            cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), ((androidx.p016lifecycle.h) y0Var).w());
            rVar.R();
        } else {
            rVar.X(-1462995611);
            rVar.R();
            cVarA = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return cVarA;
    }

    private static final <DATA> CreationExtras H(p136y9.w wVar, final DATA data) {
        if (data == null || fr.t.c(data, oq.i0.f148189a)) {
            return wVar.x();
        }
        p7.d dVar = (p7.d) wVar.x();
        dVar.c(hq.c.f86279e, new er.l() { // from class: f00.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.I(data, obj);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 I(Object obj, Object obj2) {
        return ((j0) obj2).a(obj);
    }

    public static final s J(g0 g0Var, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            g0Var = new g0.Animated(null, null, null, null, 15, null);
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1581332220, i15, -1, "pl.gov.coi.common.navigation.destinationNavigator (Destination.kt:114)");
        }
        g1 g1VarA = z9.u.a(new s1[0], rVar, 0);
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        l00.a aVar = (l00.a) q7.d.c(q0.c(l00.a.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        s sVar = new s(g0Var, g1VarA, aVar, aVar);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return sVar;
    }

    public static final List<SharedDestinationSpec> K() {
        return f54561a;
    }

    public static final <VM extends t0 & zx.d<ACTION, oq.i0>, CLASS extends mr.c<VM>, ACTION, T extends zx.d<ACTION, oq.i0>> void n(p136y9.w wVar, CLASS r15, er.q<? super T, ? super p076m2.r, ? super Integer, oq.i0> qVar, er.q<? super VM, ? super p076m2.r, ? super Integer, oq.i0> qVar2, p076m2.r rVar, final int i15) {
        int i16;
        final er.q<? super VM, ? super p076m2.r, ? super Integer, oq.i0> qVar3;
        final er.q<? super T, ? super p076m2.r, ? super Integer, oq.i0> qVar4;
        final CLASS r16;
        final p136y9.w wVar2;
        p076m2.r rVarH = rVar.h(-208659869);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(r15) : rVarH.G(r15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(qVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(qVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-208659869, i16, -1, "pl.gov.coi.common.navigation.CreateDestinationTypeSafe (Destination.kt:250)");
            }
            oq.i0 i0Var = oq.i0.f148189a;
            int i17 = (i16 & 14) | MLKEMEngine.KyberPolyBytes | (((i16 >> 3) & 8) << 3) | (i16 & 112);
            int i18 = i16 << 3;
            o(wVar, r15, i0Var, qVar, qVar2, rVarH, i17 | (i18 & 7168) | (i18 & 57344));
            wVar2 = wVar;
            r16 = r15;
            qVar4 = qVar;
            qVar3 = qVar2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            qVar3 = qVar2;
            qVar4 = qVar;
            r16 = r15;
            wVar2 = wVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.q(wVar2, r16, qVar4, qVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <VM extends t0 & zx.d<ACTION, DATA>, CLASS extends mr.c<VM>, DATA, ACTION, T extends zx.d<ACTION, DATA>> void o(final p136y9.w wVar, final CLASS r15, final DATA data, final er.q<? super T, ? super p076m2.r, ? super Integer, oq.i0> qVar, final er.q<? super VM, ? super p076m2.r, ? super Integer, oq.i0> qVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1272038871);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(r15) : rVarH.G(r15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(data) : rVarH.G(data) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(qVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1272038871, i17, -1, "pl.gov.coi.common.navigation.CreateDestinationTypeSafe (Destination.kt:221)");
            }
            t0 t0VarC = q7.d.c(r15, wVar, null, G(wVar, rVarH, i17 & 14), H(wVar, data), rVarH, ((i17 << 3) & 112) | ((i17 >> 3) & 14), 4);
            if (data != null && !(data instanceof oq.i0)) {
                ((zx.d) t0VarC).P5(data);
            }
            qVar.w((zx.d) t0VarC, rVarH, Integer.valueOf((i17 >> 6) & 112));
            qVar2.w(t0VarC, rVarH, Integer.valueOf((i17 >> 9) & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.p(wVar, r15, data, qVar, qVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(p136y9.w wVar, mr.c cVar, Object obj, er.q qVar, er.q qVar2, int i15, p076m2.r rVar, int i16) {
        o(wVar, cVar, obj, qVar, qVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(p136y9.w wVar, mr.c cVar, er.q qVar, er.q qVar2, int i15, p076m2.r rVar, int i16) {
        n(wVar, cVar, qVar, qVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <DATA, ACTION, T extends zx.d<ACTION, DATA>> void r(final p136y9.w wVar, final zx.c<DATA> cVar, final DATA data, final er.q<? super T, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15) {
        int i16;
        SharedDestinationSpec i0Var;
        p076m2.r rVarH = rVar.h(-1948673075);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(data) : rVarH.G(data) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1948673075, i17, -1, "pl.gov.coi.common.navigation.CreateSharedDestinationTypeSafe (Destination.kt:191)");
            }
            Iterator<T> it = f54561a.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                i0Var = (SharedDestinationSpec) it.next();
            } while (!i0Var.a().isInstance(cVar));
            Object objB = q7.d.b(i0Var.c(), wVar, null, G(wVar, rVarH, i17 & 14), H(wVar, data), rVarH, (i17 << 3) & 112, 4);
            if (data != null) {
                ((zx.d) objB).P5(data);
            }
            qVar.w((zx.d) objB, rVarH, Integer.valueOf((i17 >> 6) & 112));
            i0Var.b().w(objB, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.s(wVar, cVar, data, qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(p136y9.w wVar, zx.c cVar, Object obj, er.q qVar, int i15, p076m2.r rVar, int i16) {
        r(wVar, cVar, obj, qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(d1 d1Var, zx.a aVar, final g0 g0Var, final er.r<? super p114t0.f, ? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> rVar) {
        if (g0Var instanceof g0.Animated) {
            z9.t.b(d1Var, aVar.getRoute(), pq.v.n(), pq.v.n(), new er.l() { // from class: f00.e
                @Override // er.l
                public final Object b(Object obj) {
                    return r.v(g0Var, (p114t0.h) obj);
                }
            }, new er.l() { // from class: f00.i
                @Override // er.l
                public final Object b(Object obj) {
                    return r.w(g0Var, (p114t0.h) obj);
                }
            }, new er.l() { // from class: f00.j
                @Override // er.l
                public final Object b(Object obj) {
                    return r.x(g0Var, (p114t0.h) obj);
                }
            }, new er.l() { // from class: f00.k
                @Override // er.l
                public final Object b(Object obj) {
                    return r.y(g0Var, (p114t0.h) obj);
                }
            }, null, rVar, 128, null);
        } else {
            if (!(g0Var instanceof g0.Dialog)) {
                throw new oq.p();
            }
            z9.t.c(d1Var, aVar.getRoute(), pq.v.n(), pq.v.n(), ((g0.Dialog) g0Var).getType().getDialogProperties(), y2.m.b(1292830521, true, new er.q() { // from class: f00.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.z(rVar, (p136y9.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }));
        }
    }

    public static /* synthetic */ void u(d1 d1Var, zx.a aVar, g0 g0Var, er.r rVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            g0Var = new g0.Animated(null, null, null, null, 15, null);
        }
        t(d1Var, aVar, g0Var, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.c0 v(g0 g0Var, p114t0.h hVar) {
        return ((g0.Animated) g0Var).getEnterTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.e0 w(g0 g0Var, p114t0.h hVar) {
        return ((g0.Animated) g0Var).getExitTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.c0 x(g0 g0Var, p114t0.h hVar) {
        return ((g0.Animated) g0Var).getPopEnterTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.e0 y(g0 g0Var, p114t0.h hVar) {
        return ((g0.Animated) g0Var).getPopExitTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final er.r rVar, p136y9.w wVar, p076m2.r rVar2, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1292830521, i15, -1, "pl.gov.coi.common.navigation.addDestination.<anonymous> (Destination.kt:80)");
        }
        p114t0.d.a(wVar, null, null, null, "AnimatedContent", null, y2.m.d(-1235567062, true, new er.r() { // from class: f00.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.A(rVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }, rVar2, 54), rVar2, (i15 & 14) | 1597440, 46);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
