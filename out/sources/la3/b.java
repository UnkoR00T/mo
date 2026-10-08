package la3;

import b5.v;
import d1.e0;
import d1.i;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import fr.t;
import j70.h;
import mx.Label;
import n50.e;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import q4.TextStyle;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lla3/b;", "Ln50/e;", "Lmx/a;", "topInfo", "title", "Lla3/b$a;", "description", "<init>", "(Lmx/a;Lmx/a;Lla3/b$a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lmx/a;", "getTopInfo", "()Lmx/a;", "b", "getTitle", "c", "Lla3/b$a;", "getDescription", "()Lla3/b$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label topInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DescriptionLabel description;

    /* JADX INFO: renamed from: la3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lla3/b$a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "contentDescriptionLabel", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DescriptionLabel {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescriptionLabel;

        public DescriptionLabel(Label label, Label label2) {
            this.label = label;
            this.contentDescriptionLabel = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getContentDescriptionLabel() {
            return this.contentDescriptionLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DescriptionLabel)) {
                return false;
            }
            DescriptionLabel descriptionLabel = (DescriptionLabel) other;
            return t.c(this.label, descriptionLabel.label) && t.c(this.contentDescriptionLabel, descriptionLabel.contentDescriptionLabel);
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            Label label = this.contentDescriptionLabel;
            return iHashCode + (label == null ? 0 : label.hashCode());
        }

        public String toString() {
            return "DescriptionLabel(label=" + this.label + ", contentDescriptionLabel=" + this.contentDescriptionLabel + ')';
        }
    }

    public b(Label label, Label label2, DescriptionLabel descriptionLabel) {
        this.topInfo = label;
        this.title = label2;
        this.description = descriptionLabel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        k70.a aVar;
        r rVarH = rVar.h(1932832276);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1932832276, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.component.TripOverviewMainCardCustomContent.Content (TripOverviewMainCardCustomContent.kt:18)");
            }
            i iVar = i.f39152a;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            i.f fVarR = iVar.r(aVar2.b(rVarH, i17).getSpacing100());
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(fVarR, c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label label = this.topInfo;
            if (label == null) {
                rVarH.X(-725150362);
                rVarH.R();
                aVar = aVar2;
            } else {
                rVarH.X(-725150361);
                aVar = aVar2;
                h.g(null, "TripOverviewMainCardTopTitle", label, null, null, aVar2.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 0, 0, null, aVar2.f(rVarH, i17).d(), null, null, false, false, j70.a.NORMAL, rVarH, 48, 24576, 24960, 12042201);
                rVarH = rVarH;
                rVarH.R();
            }
            Label label2 = this.title;
            TextStyle textStyleM = aVar.f(rVarH, i17).m();
            v.Companion companion3 = v.INSTANCE;
            int iB = companion3.b();
            j70.a aVar3 = j70.a.NORMAL;
            rVar2 = rVarH;
            h.g(null, "TripOverviewMainCardTitle", label2, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, iB, false, 0, 0, null, textStyleM, null, null, false, false, aVar3, rVar2, 48, 24576, 24960, 12042233);
            h.g(null, "TripOverviewMainCardDescription", this.description.getLabel(), this.description.getContentDescriptionLabel(), null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, companion3.b(), false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, aVar3, rVar2, 48, 24576, 24960, 12042193);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: la3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f117438a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
