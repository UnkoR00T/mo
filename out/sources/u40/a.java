package u40;

import androidx.compose.ui.graphics.Color;
import er.p;
import eu.h;
import eu.k;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import pq.v;
import t40.InfoRowListData;
import z60.DSScreenShotTestData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lu40/a;", "Lz60/b;", "Lt40/b;", "<init>", "()V", "Leu/h;", "Lz60/c;", "a", "Leu/h;", "d", "()Leu/h;", "screenShotTestValues", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends z60.b<InfoRowListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<DSScreenShotTestData<InfoRowListData>> screenShotTestValues = k.s(new DSScreenShotTestData("InfoRowBullet", new InfoRowListData(v.q(new t40.a.C4874a(a("Bullet info row description Bullet info row description Bullet info row description Bullet info row description Bullet info row description Bullet info row description Bullet info row description ")), new t40.a.C4874a(a("Bullet info row description"))))), new DSScreenShotTestData("InfoRowDefault", new InfoRowListData(v.q(new t40.a.b(a("Description label 1 Description label 1 Description label 1 Description label 1 Description label 1"), jz.a.f106902y, C5083a.f195323a, a("Title label 1")), new t40.a.b(a("Description label 2"), jz.a.f106727a, b.f195324a, a("Title label 2"))))));

    /* JADX INFO: renamed from: u40.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5083a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5083a f195323a = new C5083a();

        C5083a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1234587962);
            if (t.k()) {
                t.o(1234587962, i15, -1, "pl.gov.coi.common.ui.ds.inforow.provider.InfoRowPPP.screenShotTestValues.<anonymous> (InfoRowPPP.kt:35)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jD;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f195324a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-770902917);
            if (t.k()) {
                t.o(-770902917, i15, -1, "pl.gov.coi.common.ui.ds.inforow.provider.InfoRowPPP.screenShotTestValues.<anonymous> (InfoRowPPP.kt:41)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Override // z60.b
    public h<DSScreenShotTestData<InfoRowListData>> d() {
        return this.screenShotTestValues;
    }
}
