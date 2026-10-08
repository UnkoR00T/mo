package zi1;

import androidx.compose.ui.graphics.Color;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.m;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: zi1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lzi1/b;", "Ln50/e;", "", "testTag", "topInfo", "title", "Lr50/f;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr50/f;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestTag", "b", "getTopInfo", "c", "getTitle", "d", "Lr50/f;", "e", "()Lr50/f;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OccupancyInfoCardCustomContent implements n50.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final r50.f status;

    /* JADX INFO: renamed from: zi1.b$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {
        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(571928095);
            if (t.k()) {
                t.o(571928095, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.OccupancyInfoCardCustomContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OccupancyInfoCardCustomContent.kt:65)");
            }
            long jB = c.b(OccupancyInfoCardCustomContent.this.getStatus(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public OccupancyInfoCardCustomContent(String str, String str2, String str3, r50.f fVar) {
        this.testTag = str;
        this.topInfo = str2;
        this.title = str3;
        this.status = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(OccupancyInfoCardCustomContent occupancyInfoCardCustomContent, int i15, r rVar, int i16) {
        occupancyInfoCardCustomContent.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        final OccupancyInfoCardCustomContent occupancyInfoCardCustomContent = this;
        r rVarH = rVar.h(-1587216540);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(occupancyInfoCardCustomContent) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1587216540, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.OccupancyInfoCardCustomContent.Content (OccupancyInfoCardCustomContent.kt:36)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            m.Companion companion2 = m.INSTANCE;
            m mVarK = androidx.compose.foundation.layout.d.k(companion2, h0.Z(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarK);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            d1.i.f fVarE = iVar.e();
            m mVarC = p3.c(q3Var, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(fVarE, companion.k(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            String str = occupancyInfoCardCustomContent.testTag + "TopInfoLabel";
            Label labelB = mx.b.b(occupancyInfoCardCustomContent.topInfo, "");
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, str, labelB, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030105);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            w0 w0VarB2 = m3.b(iVar.j(), companion.i(), rVarH, 48);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = f3.j.e(rVarH, companion2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarB2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d40.h.f(null, new d40.b.C0864b(this.testTag + "Icon", jz.a.R1, d40.i.d.f39707e, new a(), Label.INSTANCE.c(), null, 32, null), false, rVarH, d40.b.C0864b.f39687h << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            rVar2 = rVarH;
            occupancyInfoCardCustomContent = this;
            j70.h.g(null, this.testTag + "BodyTitle", mx.b.b(this.title, ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030137);
            rVar2.x();
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zi1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return OccupancyInfoCardCustomContent.d(this.f235347a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r50.f getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OccupancyInfoCardCustomContent)) {
            return false;
        }
        OccupancyInfoCardCustomContent occupancyInfoCardCustomContent = (OccupancyInfoCardCustomContent) other;
        return fr.t.c(this.testTag, occupancyInfoCardCustomContent.testTag) && fr.t.c(this.topInfo, occupancyInfoCardCustomContent.topInfo) && fr.t.c(this.title, occupancyInfoCardCustomContent.title) && this.status == occupancyInfoCardCustomContent.status;
    }

    public int hashCode() {
        return (((((this.testTag.hashCode() * 31) + this.topInfo.hashCode()) * 31) + this.title.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "OccupancyInfoCardCustomContent(testTag=" + this.testTag + ", topInfo=" + this.topInfo + ", title=" + this.title + ", status=" + this.status + ')';
    }
}
