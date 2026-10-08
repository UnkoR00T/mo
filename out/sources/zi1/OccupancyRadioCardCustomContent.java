package zi1;

import androidx.compose.ui.graphics.Color;
import b1.l;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.m;
import mx.Label;
import n50.h0;
import n50.j0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.r1;

/* JADX INFO: renamed from: zi1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\t\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010(¨\u0006*"}, d2 = {"Lzi1/h;", "Ln50/e;", "", "testTag", "title", "bottomInfo", "Lr50/f;", "status", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr50/f;Z)V", "Loq/i0;", "a", "(Lm2/r;I)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestTag", "b", "getTitle", "c", "getBottomInfo", "d", "Lr50/f;", "k", "()Lr50/f;", "e", "Z", "()Z", "Lkotlin/Function1;", "Ln50/e$a;", "Lf3/m;", "()Ler/q;", "customContainerModifier", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OccupancyRadioCardCustomContent implements n50.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bottomInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final r50.f status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: zi1.h$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {
        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-10760359);
            if (t.k()) {
                t.o(-10760359, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.OccupancyRadioCardCustomContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OccupancyRadioCardCustomContent.kt:93)");
            }
            long jF = j.f(OccupancyRadioCardCustomContent.this.getStatus(), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jF;
        }
    }

    public OccupancyRadioCardCustomContent(String str, String str2, String str3, r50.f fVar, boolean z15) {
        this.testTag = str;
        this.title = str2;
        this.bottomInfo = str3;
        this.status = fVar;
        this.isSelected = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(OccupancyRadioCardCustomContent occupancyRadioCardCustomContent, int i15, r rVar, int i16) {
        occupancyRadioCardCustomContent.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m h(OccupancyRadioCardCustomContent occupancyRadioCardCustomContent, final n50.e.CustomContainerModifierData customContainerModifierData, r rVar, int i15) {
        rVar.X(161999413);
        if (t.k()) {
            t.o(161999413, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.OccupancyRadioCardCustomContent.<get-customContainerModifier>.<anonymous> (OccupancyRadioCardCustomContent.kt:46)");
        }
        m.Companion companion = m.INSTANCE;
        boolean z15 = occupancyRadioCardCustomContent.isSelected;
        l interactionSource = customContainerModifierData.getInteractionSource();
        r1 r1VarE = s.E(0.0f, rVar, 0, 1);
        n4.l lVarJ = n4.l.j(n4.l.INSTANCE.f());
        boolean z16 = (((i15 & 14) ^ 6) > 4 && rVar.G(customContainerModifierData)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z16 || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: zi1.f
                @Override // er.a
                public final Object a() {
                    return OccupancyRadioCardCustomContent.i(customContainerModifierData);
                }
            };
            rVar.v(objE);
        }
        m mVarA = k1.d.a(companion, z15, interactionSource, r1VarE, true, lVarJ, (er.a) objE);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final n50.e.CustomContainerModifierData customContainerModifierData) {
        cx.a.a(customContainerModifierData.getEventThrottler(), 0L, new er.a() { // from class: zi1.g
            @Override // er.a
            public final Object a() {
                return OccupancyRadioCardCustomContent.j(customContainerModifierData);
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n50.e.CustomContainerModifierData customContainerModifierData) {
        customContainerModifierData.c().a();
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        final OccupancyRadioCardCustomContent occupancyRadioCardCustomContent = this;
        r rVarH = rVar.h(-479550626);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(occupancyRadioCardCustomContent) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-479550626, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.components.OccupancyRadioCardCustomContent.Content (OccupancyRadioCardCustomContent.kt:59)");
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
            j.b(occupancyRadioCardCustomContent.isSelected, j0.a.f132074a, rVarH, j0.a.f132075b << 3);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
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
            j70.h.g(null, occupancyRadioCardCustomContent.testTag + "Title", mx.b.b(occupancyRadioCardCustomContent.title, ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030137);
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
            d40.h.f(null, new d40.b.C0864b(this.testTag + "Icon", jz.a.R1, d40.i.b.f39705e, new a(), Label.INSTANCE.c(), null, 32, null), false, rVarH, d40.b.C0864b.f39687h << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            rVar2 = rVarH;
            occupancyRadioCardCustomContent = this;
            j70.h.g(null, this.testTag + "BodyTitle", mx.b.b(this.bottomInfo, ""), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030105);
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
            d5VarM.a(new p() { // from class: zi1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return OccupancyRadioCardCustomContent.g(this.f235355a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
        return new q() { // from class: zi1.e
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return OccupancyRadioCardCustomContent.h(this.f235357a, (n50.e.CustomContainerModifierData) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        };
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OccupancyRadioCardCustomContent)) {
            return false;
        }
        OccupancyRadioCardCustomContent occupancyRadioCardCustomContent = (OccupancyRadioCardCustomContent) other;
        return fr.t.c(this.testTag, occupancyRadioCardCustomContent.testTag) && fr.t.c(this.title, occupancyRadioCardCustomContent.title) && fr.t.c(this.bottomInfo, occupancyRadioCardCustomContent.bottomInfo) && this.status == occupancyRadioCardCustomContent.status && this.isSelected == occupancyRadioCardCustomContent.isSelected;
    }

    public int hashCode() {
        return (((((((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31) + this.bottomInfo.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final r50.f getStatus() {
        return this.status;
    }

    public String toString() {
        return "OccupancyRadioCardCustomContent(testTag=" + this.testTag + ", title=" + this.title + ", bottomInfo=" + this.bottomInfo + ", status=" + this.status + ", isSelected=" + this.isSelected + ')';
    }
}
