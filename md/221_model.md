# Paczka 221 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `xd4/b0.java`

## xd4/b0.java

Powiązane klasy (możesz dosłać): `p063io3/Function0.java`

```java
package xd4;

import android.os.Build;
import android.os.Bundle;
import fr.q0;
import go3.o0;
import oq.i0;
import p063io3.Function0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010<\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lxd4/b0;", "Lj00/b;", "Lgx/c;", "<init>", "()V", "Landroid/os/Bundle;", "Lwn3/c;", "h2", "(Landroid/os/Bundle;)Lwn3/c;", "savedInstanceState", "Loq/i0;", "x0", "(Landroid/os/Bundle;)V", "C0", "S1", "(Lm2/r;I)V", "Lgx/b;", "event", "", "j5", "(Lgx/b;)Z", "Lgx/d;", "L0", "Lgx/d;", "k2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "j2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgo3/o0;", "N0", "Lgo3/o0;", "l2", "()Lgo3/o0;", "setShouldIntroScannerStateUseCase", "(Lgo3/o0;)V", "shouldIntroScannerStateUseCase", "Lxd4/v;", "O0", "Lxd4/v;", "i2", "()Lxd4/v;", "setEntryPointMapper", "(Lxd4/v;)V", "entryPointMapper", "<set-?>", "P0", "Lir/e;", "g2", "()Lwn3/c;", "m2", "(Lwn3/c;)V", "entryPoint", "Q0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends w implements gx.c {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public o0 shouldIntroScannerStateUseCase;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public v entryPointMapper;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final ir.e entryPoint = ir.a.f96711a.a();
    static final /* synthetic */ mr.l<Object>[] R0 = {q0.f(new fr.b0(b0.class, "entryPoint", "getEntryPoint()Lpl/gov/coi/mobywatel/feature/verification/contract/model/VerificationEntryPoint;", 0))};

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int S0 = 8;

    /* JADX INFO: renamed from: xd4.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lxd4/b0$a;", "", "<init>", "()V", "Lxd4/u;", "entryPoint", "Lxd4/b0;", "a", "(Lxd4/u;)Lxd4/b0;", "", "TAG", "Ljava/lang/String;", "KEY_ENTRY_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b0 a(u entryPoint) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_entry_point", entryPoint);
            b0 b0Var = new b0();
            b0Var.F1(bundle);
            return b0Var;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(final b0 b0Var, p076m2.r rVar, int i15) {
        p063io3.k kVar;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-765146211, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.verification.VerificationFeatureFragment.GetContent.<anonymous> (VerificationFeatureFragment.kt:67)");
            }
            wn3.c cVarG2 = b0Var.g2();
            wn3.c cVarG3 = b0Var.g2();
            if (fr.t.c(cVarG3, wn3.c.a.C5672a.f214188a)) {
                kVar = io3.k.h.f96077a;
            } else if (fr.t.c(cVarG3, wn3.c.b.m.f214204a)) {
                kVar = io3.k.i.f96079a;
            } else if (cVarG3 instanceof wn3.c.b.WithDeeplink) {
                kVar = io3.k.a.f96063a;
            } else {
                kVar = b0Var.l2().c(gz.b.a.C1792a.f78542a).booleanValue() ? io3.k.f.f96073a : io3.k.i.f96079a;
            }
            p063io3.k kVar2 = kVar;
            boolean zG = rVar.G(b0Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: xd4.z
                    @Override // er.a
                    public final Object a() {
                        return b0.d2(this.f218104a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(b0Var);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: xd4.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.e2(this.f218060a, (gx.b) obj);
                    }
                };
                rVar.v(objE2);
            }
            Function0.I(aVar, (er.l) objE2, cVarG2, kVar2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(b0 b0Var) {
        b0Var.j2().c("TAG_VERIFICATION");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e2(b0 b0Var, gx.b bVar) {
        b0Var.k2().c(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(b0 b0Var, int i15, p076m2.r rVar, int i16) {
        b0Var.S1(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private final wn3.c g2() {
        return (wn3.c) this.entryPoint.a(this, R0[0]);
    }

    private final wn3.c h2(Bundle bundle) {
        u uVar = Build.VERSION.SDK_INT >= 33 ? (u) bundle.getParcelable("key_entry_point", u.class) : (u) bundle.getParcelable("key_entry_point");
        return uVar != null ? i2().b(uVar) : wn3.c.a.C5672a.f214188a;
    }

    private final void m2(wn3.c cVar) {
        this.entryPoint.b(this, R0[0], cVar);
    }

    @Override // androidx.fragment.app.o
    public void C0() {
        k2().a(this);
        super.C0();
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1087460239);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1087460239, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.verification.VerificationFeatureFragment.GetContent (VerificationFeatureFragment.kt:66)");
            }
            mc4.d.d(false, y2.m.d(-765146211, true, new er.p() { // from class: xd4.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.c2(this.f218101a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xd4.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.f2(this.f218102a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final v i2() {
        v vVar = this.entryPointMapper;
        if (vVar != null) {
            return vVar;
        }
        return null;
    }

    public final rh2.a j2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // gx.c
    public boolean j5(gx.b event) {
        if (!(event instanceof zw0.a.ToAddDocument)) {
            return false;
        }
        j2().c("TAG_VERIFICATION");
        k2().c(event);
        return true;
    }

    public final gx.d k2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final o0 l2() {
        o0 o0Var = this.shouldIntroScannerStateUseCase;
        if (o0Var != null) {
            return o0Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        k2().b(this);
        Bundle bundleV = v();
        m2(bundleV != null ? h2(bundleV) : null);
    }
}

```
