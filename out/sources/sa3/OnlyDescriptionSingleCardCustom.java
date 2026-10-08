package sa3;

import android.text.Spanned;
import er.l;
import er.p;
import er.q;
import f3.m;
import j70.h;
import n50.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import u10.i;

/* JADX INFO: renamed from: sa3.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsa3/b;", "Ln50/e;", "Landroid/text/Spanned;", "description", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "<init>", "(Landroid/text/Spanned;Ler/l;)V", "a", "(Lm2/r;I)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/text/Spanned;", "b", "Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnlyDescriptionSingleCardCustom implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Spanned description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<String, i0> onUrlClick;

    /* JADX WARN: Multi-variable type inference failed */
    public OnlyDescriptionSingleCardCustom(Spanned spanned, l<? super String, i0> lVar) {
        this.description = spanned;
        this.onUrlClick = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(OnlyDescriptionSingleCardCustom onlyDescriptionSingleCardCustom, int i15, r rVar, int i16) {
        onlyDescriptionSingleCardCustom.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-207573838);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-207573838, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.component.OnlyDescriptionSingleCardCustom.Content (OnlyDescriptionSingleCardCustom.kt:14)");
            }
            q4.e eVarN = i.n(this.description, this.onUrlClick, rVarH, 0, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            h.g(null, null, null, null, eVarN, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030095);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: sa3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return OnlyDescriptionSingleCardCustom.d(this.f179851a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlyDescriptionSingleCardCustom)) {
            return false;
        }
        OnlyDescriptionSingleCardCustom onlyDescriptionSingleCardCustom = (OnlyDescriptionSingleCardCustom) other;
        return fr.t.c(this.description, onlyDescriptionSingleCardCustom.description) && fr.t.c(this.onUrlClick, onlyDescriptionSingleCardCustom.onUrlClick);
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.onUrlClick.hashCode();
    }

    public String toString() {
        return "OnlyDescriptionSingleCardCustom(description=" + ((Object) this.description) + ", onUrlClick=" + this.onUrlClick + ')';
    }
}
