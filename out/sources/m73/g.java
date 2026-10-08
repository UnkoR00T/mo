package m73;

import android.graphics.Bitmap;
import e40.BarCodeSingleCardData;
import er.l;
import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p073l73.j;
import p073l73.k;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002*(B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lm73/g;", "Lxw/f;", "Lm73/g$b;", "Ll73/k$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lp20/c;", "giloshScreenMapper", "Lv20/a;", "documentValidityBannerMapper", "<init>", "(Lmx/c;Lez/e;Lrz/a;Liy/a;Lp20/c;Lv20/a;)V", "", "safeBusServiceAvailable", "Lkotlin/Function0;", "Loq/i0;", "goToVerification", "goToSafeBus", "deleteDocument", "", "Lo50/a;", "h", "(ZLer/a;Ler/a;Ler/a;)Ljava/util/List;", "", "testTag", "Lmx/a;", "title", "value", "Ln50/g;", "r", "(Ljava/lang/String;Lmx/a;Lmx/a;)Ln50/g;", "params", "i", "(Lm73/g$b;)Ll73/k$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lrz/a;", "d", "Liy/a;", "e", "Lp20/c;", "f", "Lv20/a;", "g", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124116h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v20.a documentValidityBannerMapper;

    /* JADX INFO: renamed from: m73.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b*\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b\"\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b+\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001e\u0010)R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.¨\u0006/"}, d2 = {"Lm73/g$b;", "", "Ln20/b;", "Ll73/j;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "goToVerification", "goToSafeBus", "updateData", "deleteDocument", "goBack", "closeExpirationDateBanner", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "h", "()Ln20/b;", "b", "Lo20/s2;", "d", "()Lo20/s2;", "c", "Ler/a;", "g", "()Ler/a;", "f", "e", "i", "Ler/l;", "()Ler/l;", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<j> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToVerification;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSafeBus;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocument;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeExpirationDateBanner;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<j> state, s2 s2Var, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super n20.a, i0> lVar) {
            this.state = state;
            this.documentVMS = s2Var;
            this.goToVerification = aVar;
            this.goToSafeBus = aVar2;
            this.updateData = aVar3;
            this.deleteDocument = aVar4;
            this.goBack = aVar5;
            this.closeExpirationDateBanner = aVar6;
            this.dispatchAction = lVar;
        }

        public final er.a<i0> a() {
            return this.closeExpirationDateBanner;
        }

        public final er.a<i0> b() {
            return this.deleteDocument;
        }

        public final l<n20.a, i0> c() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> e() {
            return this.goBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.goToVerification, params.goToVerification) && t.c(this.goToSafeBus, params.goToSafeBus) && t.c(this.updateData, params.updateData) && t.c(this.deleteDocument, params.deleteDocument) && t.c(this.goBack, params.goBack) && t.c(this.closeExpirationDateBanner, params.closeExpirationDateBanner) && t.c(this.dispatchAction, params.dispatchAction);
        }

        public final er.a<i0> f() {
            return this.goToSafeBus;
        }

        public final er.a<i0> g() {
            return this.goToVerification;
        }

        public final State<j> h() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.goToVerification.hashCode()) * 31) + this.goToSafeBus.hashCode()) * 31) + this.updateData.hashCode()) * 31) + this.deleteDocument.hashCode()) * 31) + this.goBack.hashCode()) * 31) + this.closeExpirationDateBanner.hashCode()) * 31) + this.dispatchAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.updateData;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", goToVerification=" + this.goToVerification + ", goToSafeBus=" + this.goToSafeBus + ", updateData=" + this.updateData + ", deleteDocument=" + this.deleteDocument + ", goBack=" + this.goBack + ", closeExpirationDateBanner=" + this.closeExpirationDateBanner + ", dispatchAction=" + this.dispatchAction + ')';
        }
    }

    public g(mx.c cVar, ez.e eVar, rz.a aVar, iy.a aVar2, p20.c cVar2, v20.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.giloshScreenMapper = cVar2;
        this.documentValidityBannerMapper = aVar3;
    }

    private final List<SmallCardData> h(boolean safeBusServiceAvailable, er.a<i0> goToVerification, er.a<i0> goToSafeBus, er.a<i0> deleteDocument) {
        Label labelC = this.labelProvider.c(h73.a.f81435o);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, goToVerification, 37, null);
        SmallCardData smallCardData2 = new SmallCardData(null, this.labelProvider.c(h73.a.f81439s), null, jz.a.C0, cVar, false, goToSafeBus, 37, null);
        if (!safeBusServiceAvailable) {
            smallCardData2 = null;
        }
        return v.s(smallCardData, smallCardData2, new SmallCardData(null, this.labelProvider.c(h73.a.f81426f), null, jz.a.f106727a, o50.f.b.f142477a, false, deleteDocument, 37, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.i().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(List list) {
        return i0.f148189a;
    }

    private final DefaultSingleCardData r(String testTag, Label title, Label value) {
        return new DefaultSingleCardData(testTag, null, false, null, null, false, null, null, new BodySection(n50.l.b(title, null, null, 3, null), new n50.b.Title(n50.l.b(value, null, null, 3, null)), null, 4, null), null, null, null, 3838, null);
    }

    static /* synthetic */ DefaultSingleCardData s(g gVar, String str, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = null;
        }
        return gVar.r(str, label, label2);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        Label labelN;
        Bitmap bitmapA;
        Object objB;
        j jVarD = params.h().d();
        if (jVarD instanceof j.a) {
            return k.a.C2826a.f116889a;
        }
        if (!(jVarD instanceof j.Initialized)) {
            throw new p();
        }
        j.Initialized initialized = (j.Initialized) jVarD;
        String documentShortName = initialized.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(h73.a.C).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), labelN, null, null, null, 28, null), null, null, null, null, 61, null);
        p20.c cVar = this.giloshScreenMapper;
        List listQ = v.q(new u2.Flag(e20.k.Poland, this.labelProvider.c(h73.a.f81425e)), new u2.Hologram(null, null, 3, null));
        State<j> stateH = params.h();
        o20.p pVarB = o20.p.INSTANCE.b("student_card");
        String picture = initialized.getData().getScope().getData().getPicture();
        if (picture != null) {
            rz.a aVar = this.bitmapDecoder;
            dx.i iVarC = iy.a.c(this.base64Coder, picture, null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) iVarC).b();
            }
            bitmapA = aVar.a((byte[]) objB);
        } else {
            bitmapA = null;
        }
        boolean zE = initialized.getStatus().e();
        Label labelC = initialized.getStatus().e() ? this.labelProvider.c(h73.a.f81431k) : this.labelProvider.c(h73.a.f81429i);
        Label labelC2 = this.labelProvider.c(h73.a.f81427g);
        er.a<i0> aVarI = params.i();
        Label labelC3 = this.labelProvider.c(h73.a.f81432l);
        String names = initialized.getData().getScope().getData().getNames();
        Locale locale = Locale.ROOT;
        KeyValueData keyValueData = new KeyValueData(mx.b.b(names.toUpperCase(locale), "student_first_name_value"), labelC3, false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.b(initialized.getData().getScope().getData().getSurname().toUpperCase(locale), "student_last_name_value"), this.labelProvider.c(h73.a.f81434n), false, 4, null);
        Label labelC4 = this.labelProvider.c(h73.a.f81428h);
        ez.e eVar = this.dateFormatter;
        fz.b.Date date = new fz.b.Date(initialized.getData().getScope().getData().getBirthday());
        fz.c cVar2 = fz.c.DOTTED;
        DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, stateH, pVarB, bitmapA, null, null, null, zE, labelC, labelC2, aVarI, v.q(keyValueData, keyValueData2, new KeyValueData(mx.b.b(eVar.d(date, cVar2), "student_birth_date_value"), labelC4, false, 4, null), new KeyValueData(mx.b.b(initialized.getData().getScope().getData().getPesel(), "student_pesel_value"), this.labelProvider.c(h73.a.f81433m), false, 4, null), new KeyValueData(mx.b.b(this.dateFormatter.d(new fz.b.Date(initialized.getData().getScope().getData().getDistributionDate()), cVar2), "student_card_distribution_date_value"), this.labelProvider.c(h73.a.A), false, 4, null), new KeyValueData(mx.b.b(initialized.getData().getScope().getData().getUniversityName().toUpperCase(locale), "student_card_college_name_value"), this.labelProvider.c(h73.a.f81446z), false, 4, null)), null, null, params.c(), params.getDocumentVMS(), 12400, null));
        c30.b.C0606b c0606bB = this.documentValidityBannerMapper.b(new v20.a.Params(initialized.getData().getScope().getData().getExpireDate(), h73.a.f81441u, h73.a.f81440t, h73.a.f81442v, h73.a.f81443w, new er.a() { // from class: m73.e
            @Override // er.a
            public final Object a() {
                return g.m(params);
            }
        }, new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(h73.a.f81423c), null, null, new er.a() { // from class: m73.d
            @Override // er.a
            public final Object a() {
                return g.l(params);
            }
        }, 13, null))));
        if (!initialized.getShowExpirationDateBanner() || v.q(k73.b.INACTIVE, k73.b.REVOKED).contains(initialized.getStatus())) {
            c0606bB = null;
        }
        List listR = v.r(c0606bB);
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(h(initialized.getSafeBusServiceAvailable(), params.g(), params.f(), params.b()), new ShortcutMoreData(this.labelProvider.c(h73.a.f81436p), new l() { // from class: m73.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.q((List) obj);
            }
        })));
        DefaultSingleCardData defaultSingleCardDataS = s(this, null, this.labelProvider.c(h73.a.f81445y), mx.b.b(initialized.getData().getScope().getData().getCardNumber(), "student_card_card_number_value"), 1, null);
        Bitmap barcodeBitmap = initialized.getBarcodeBitmap();
        o20.l.Section section = new o20.l.Section(null, v.q(defaultSingleCardDataS, barcodeBitmap != null ? new CustomSingleCardData("StudentCardBarCodeSingleCard", new e40.b(new BarCodeSingleCardData(this.labelProvider.c(h73.a.f81444x), new n50.i.Image(barcodeBitmap, null, null, 6, null))), null, false, null, null, false, null, 252, null) : r("StudentCardBarCodeSingleCard", this.labelProvider.c(h73.a.f81444x), Label.INSTANCE.b())), 1, null);
        Label labelC5 = this.labelProvider.c(h73.a.f81430j);
        Long timestamp = initialized.getData().getScope().getDataHeader().getTimestamp();
        return new k.a.Initialized(baseScaffoldData, new BaseDocumentData(null, null, null, documentGiloshDataB, v.s(shortcuts, section, new o20.l.UpdateDataItem(labelC5, mx.b.d(timestamp != null ? this.dateFormatter.d(new fz.b.Long(timestamp.longValue()), cVar2) : null, "student_card_last_update_value"), this.labelProvider.c(h73.a.f81424d), null, params.i(), 8, null)), listR, v.e(new c30.b.c(null, null, null, this.labelProvider.c(h73.a.B), null, null, null, 119, null)), 7, null), params.e());
    }
}
