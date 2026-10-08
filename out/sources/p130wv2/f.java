package p130wv2;

import cb4.DialogData;
import cw3.IdentityPhotoData;
import dw2.n;
import er.l;
import er.q;
import jy2.o;
import ly2.s;
import mv2.CustomErrorData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import tt3.AddressSearchData;
import y2.m;
import yx2.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f215370a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<s, r, Integer, i0> f215371b = m.b(1556919537, false, new q() { // from class: wv2.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.k((s) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q<n, r, Integer, i0> f215372c = m.b(2025207924, false, new q() { // from class: wv2.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.m((n) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q<yx2.h, r, Integer, i0> f215373d = m.b(2022864711, false, new q() { // from class: wv2.c
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.l((h) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static q<jy2.r, r, Integer, i0> f215374e = m.b(-1955391702, false, new q() { // from class: wv2.d
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.o((jy2.r) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static q<xv2.n, r, Integer, i0> f215375f = m.b(-1058566493, false, new q() { // from class: wv2.e
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.n((xv2.n) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements l<AddressSearchData, i0> {
        a(Object obj) {
            super(1, obj, yx2.h.class, "goToSearch", "goToSearch(Lpl/gov/coi/mobywatel/segment/addressform/contract/addresssearch/AddressSearchData;)V", 0);
        }

        public final void E(AddressSearchData addressSearchData) {
            ((yx2.h) this.f66391b).s9(addressSearchData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(AddressSearchData addressSearchData) {
            E(addressSearchData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements l<IdentityPhotoData, i0> {
        b(Object obj) {
            super(1, obj, yx2.h.class, "goToIdentityPhoto", "goToIdentityPhoto(Lpl/gov/coi/mobywatel/segment/identityphoto/contract/IdentityPhotoData;)V", 0);
        }

        public final void E(IdentityPhotoData identityPhotoData) {
            ((yx2.h) this.f66391b).r9(identityPhotoData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(IdentityPhotoData identityPhotoData) {
            E(identityPhotoData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<i0> {
        c(Object obj) {
            super(0, obj, yx2.h.class, "showCloseProcessDialog", "showCloseProcessDialog()V", 0);
        }

        public final void E() {
            ((yx2.h) this.f66391b).w9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements l<DialogData, i0> {
        d(Object obj) {
            super(1, obj, yx2.h.class, "showDialog", "showDialog(Lpl/gov/coi/shared/segment/dialog/contract/DialogData;)V", 0);
        }

        public final void E(DialogData dialogData) {
            ((yx2.h) this.f66391b).x9(dialogData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(DialogData dialogData) {
            E(dialogData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements l<al0.g, i0> {
        e(Object obj) {
            super(1, obj, yx2.h.class, "goToSuccess", "goToSuccess(Lpl/gov/coi/mobywatel/be/documentmanagementservice/contract/model/ApplicationOwnerWithAge;)V", 0);
        }

        public final void E(al0.g gVar) {
            ((yx2.h) this.f66391b).t9(gVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(al0.g gVar) {
            E(gVar);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: wv2.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class C5723f extends fr.q implements l<dx3.a, i0> {
        C5723f(Object obj) {
            super(1, obj, yx2.h.class, "showImagePreview", "showImagePreview(Lpl/gov/coi/mobywatel/segment/imagepreview/contract/ImagePreviewData;)V", 0);
        }

        public final void E(dx3.a aVar) {
            ((yx2.h) this.f66391b).y9(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(dx3.a aVar) {
            E(aVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements l<CustomErrorData, i0> {
        g(Object obj) {
            super(1, obj, yx2.h.class, "goToCustomError", "goToCustomError(Lpl/gov/coi/mobywatel/feature/physicalidcardapplication/domain/model/customerror/CustomErrorData;)V", 0);
        }

        public final void E(CustomErrorData customErrorData) {
            ((yx2.h) this.f66391b).p9(customErrorData);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(CustomErrorData customErrorData) {
            E(customErrorData);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.a<i0> {
        h(Object obj) {
            super(0, obj, yx2.h.class, "exitProcess", "exitProcess()V", 0);
        }

        public final void E() {
            ((yx2.h) this.f66391b).o9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class i extends fr.q implements l<jb4.b, i0> {
        i(Object obj) {
            super(1, obj, yx2.h.class, "goToError", "goToError(Lpl/gov/coi/shared/segment/error/contract/model/ErrorData;)V", 0);
        }

        public final void E(jb4.b bVar) {
            ((yx2.h) this.f66391b).P6(bVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(jb4.b bVar) {
            E(bVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class j extends fr.q implements er.a<i0> {
        j(Object obj) {
            super(0, obj, yx2.h.class, "closeWizardProcess", "closeWizardProcess()V", 0);
        }

        public final void E() {
            ((yx2.h) this.f66391b).p8();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class k extends fr.q implements l<mv3.a.EdorAddressRequired, i0> {
        k(Object obj) {
            super(1, obj, yx2.h.class, "goToEdorAuth", "goToEdorAuth(Lpl/gov/coi/mobywatel/segment/edorauth/contract/EdorAuthData$EdorAddressRequired;)V", 0);
        }

        public final void E(mv3.a.EdorAddressRequired edorAddressRequired) {
            ((yx2.h) this.f66391b).q9(edorAddressRequired);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(mv3.a.EdorAddressRequired edorAddressRequired) {
            E(edorAddressRequired);
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(s sVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1556919537, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.ComposableSingletons$NavContentKt.lambda$1556919537.<anonymous> (NavContent.kt:85)");
        }
        ly2.l.e(sVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(yx2.h hVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2022864711, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.ComposableSingletons$NavContentKt.lambda$2022864711.<anonymous> (NavContent.kt:182)");
        }
        boolean zG = rVar.G(hVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(hVar);
            rVar.v(objE);
        }
        l lVar = (l) ((mr.g) objE);
        boolean zG2 = rVar.G(hVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new d(hVar);
            rVar.v(objE2);
        }
        l lVar2 = (l) ((mr.g) objE2);
        boolean zG3 = rVar.G(hVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new e(hVar);
            rVar.v(objE3);
        }
        l lVar3 = (l) ((mr.g) objE3);
        boolean zG4 = rVar.G(hVar);
        Object objE4 = rVar.E();
        if (zG4 || objE4 == r.INSTANCE.a()) {
            objE4 = new C5723f(hVar);
            rVar.v(objE4);
        }
        l lVar4 = (l) ((mr.g) objE4);
        boolean zG5 = rVar.G(hVar);
        Object objE5 = rVar.E();
        if (zG5 || objE5 == r.INSTANCE.a()) {
            objE5 = new g(hVar);
            rVar.v(objE5);
        }
        l lVar5 = (l) ((mr.g) objE5);
        boolean zG6 = rVar.G(hVar);
        Object objE6 = rVar.E();
        if (zG6 || objE6 == r.INSTANCE.a()) {
            objE6 = new h(hVar);
            rVar.v(objE6);
        }
        er.a aVar = (er.a) ((mr.g) objE6);
        boolean zG7 = rVar.G(hVar);
        Object objE7 = rVar.E();
        if (zG7 || objE7 == r.INSTANCE.a()) {
            objE7 = new i(hVar);
            rVar.v(objE7);
        }
        l lVar6 = (l) ((mr.g) objE7);
        boolean zG8 = rVar.G(hVar);
        Object objE8 = rVar.E();
        if (zG8 || objE8 == r.INSTANCE.a()) {
            objE8 = new j(hVar);
            rVar.v(objE8);
        }
        er.a aVar2 = (er.a) ((mr.g) objE8);
        boolean zG9 = rVar.G(hVar);
        Object objE9 = rVar.E();
        if (zG9 || objE9 == r.INSTANCE.a()) {
            objE9 = new k(hVar);
            rVar.v(objE9);
        }
        l lVar7 = (l) ((mr.g) objE9);
        boolean zG10 = rVar.G(hVar);
        Object objE10 = rVar.E();
        if (zG10 || objE10 == r.INSTANCE.a()) {
            objE10 = new b(hVar);
            rVar.v(objE10);
        }
        l lVar8 = (l) ((mr.g) objE10);
        boolean zG11 = rVar.G(hVar);
        Object objE11 = rVar.E();
        if (zG11 || objE11 == r.INSTANCE.a()) {
            objE11 = new c(hVar);
            rVar.v(objE11);
        }
        fy2.b.b(hVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, aVar2, lVar7, lVar8, (er.a) ((mr.g) objE11), rVar, i15 & 14, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n nVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2025207924, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.ComposableSingletons$NavContentKt.lambda$2025207924.<anonymous> (NavContent.kt:103)");
        }
        dw2.k.i(nVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(xv2.n nVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1058566493, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.ComposableSingletons$NavContentKt.lambda$-1058566493.<anonymous> (NavContent.kt:258)");
        }
        xv2.k.e(nVar, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(jy2.r rVar, r rVar2, int i15) {
        if (t.k()) {
            t.o(-1955391702, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.ComposableSingletons$NavContentKt.lambda$-1955391702.<anonymous> (NavContent.kt:219)");
        }
        o.j(rVar, rVar2, i15 & 14);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    public final q<xv2.n, r, Integer, i0> f() {
        return f215375f;
    }

    public final q<jy2.r, r, Integer, i0> g() {
        return f215374e;
    }

    public final q<s, r, Integer, i0> h() {
        return f215371b;
    }

    public final q<yx2.h, r, Integer, i0> i() {
        return f215373d;
    }

    public final q<n, r, Integer, i0> j() {
        return f215372c;
    }
}
