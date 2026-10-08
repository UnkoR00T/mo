# Paczka 198 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/vi.java`

## sd4/vi.java

```java
package sd4;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/vi;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "g2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "h2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vi extends ja {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: sd4.vi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/vi$a;", "", "<init>", "()V", "Lcz2/a;", "destination", "Lsd4/vi;", "a", "(Lcz2/a;)Lsd4/vi;", "", "TAG_QUALIFIED_SIGNATURE", "Ljava/lang/String;", "TAG_QUALIFIED_SIGNATURE_DESTINATION", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final vi a(cz2.a destination) {
            vi viVar = new vi();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TAG_QUALIFIED_SIGNATURE_DESTINATION", destination);
            viVar.F1(bundle);
            return viVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(bz2.a aVar, cz2.a aVar2, final vi viVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-438749317, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.QualifiedSignatureFeatureFragment.GetContent.<anonymous>.<anonymous> (QualifiedSignatureFeatureFragment.kt:40)");
            }
            boolean zG = rVar.G(viVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.ti
                    @Override // er.a
                    public final Object a() {
                        return vi.d2(this.f180875a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar3 = (er.a) objE;
            boolean zG2 = rVar.G(viVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.ui
                    @Override // er.a
                    public final Object a() {
                        return vi.e2(this.f180891a);
                    }
                };
                rVar.v(objE2);
            }
            az2.u.n(aVar, aVar2, aVar3, (er.a) objE2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(vi viVar) {
        viVar.h2().c(new tg1.a.ToDashboard(true));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(vi viVar) {
        viVar.g2().c("TAG_QUALIFIED_SIGNATURE");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(vi viVar, int i15, p076m2.r rVar, int i16) {
        viVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(1101328630);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1101328630, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.QualifiedSignatureFeatureFragment.GetContent (QualifiedSignatureFeatureFragment.kt:28)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = bz2.d.f22033a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = bz2.e.f22035a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final bz2.a aVar = (bz2.a) objE;
            Bundle bundleV = v();
            oq.i0 i0Var = null;
            final cz2.a aVar2 = bundleV != null ? (cz2.a) bundleV.getParcelable("TAG_QUALIFIED_SIGNATURE_DESTINATION") : null;
            if (aVar2 == null) {
                rVarH.X(426416574);
                rVarH.R();
            } else {
                rVarH.X(426416575);
                mc4.d.d(false, y2.m.d(-438749317, true, new er.p() { // from class: sd4.ri
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return vi.c2(aVar, aVar2, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 48, 1);
                rVarH.R();
                i0Var = oq.i0.f148189a;
            }
            if (i0Var == null) {
                g2().c("TAG_QUALIFIED_SIGNATURE");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.si
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return vi.f2(this.f180856a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final rh2.a g2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d h2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}

```
