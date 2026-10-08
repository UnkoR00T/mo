package nd0;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cg0.Address;
import cg0.School;
import cg0.SchoolCardDataContainer;
import e20.k;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import l60.KeyValueData;
import md0.SchoolCardThemeDrawable;
import md0.SetHologramTextThemeColor;
import mx.Label;
import n20.State;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.j0;
import o20.BaseDocumentData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0019*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020&2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lnd0/i;", "Lxw/f;", "Lnd0/i$a;", "Lod0/j$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp20/c;", "giloshMapper", "<init>", "(Lmx/c;Lez/e;Lp20/c;)V", "Lod0/i$e;", "state", "params", "Lod0/j$a$c;", "u", "(Lod0/i$e;Lod0/i$e;Lnd0/i$a;)Lod0/j$a$c;", "Lmx/a;", "title", "value", "Ln50/g;", "G", "(Lmx/a;Lmx/a;)Ln50/g;", "Lcg0/c;", "", "q", "(Lcg0/c;)Ljava/lang/String;", "Lcg0/a;", "r", "(Lcg0/a;)Ljava/lang/String;", "Lcg0/b;", "m", "(Lcg0/b;)Ljava/lang/String;", "Lkotlin/Function0;", "Loq/i0;", "onDeleteAction", "onCancelAction", "Lcb4/d;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ler/a;Ler/a;)Lcb4/d;", "I", "()Lcb4/d;", "s", "(Lnd0/i$a;)Lod0/j$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lp20/c;", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, od0.j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: nd0.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001d\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b'\u0010$¨\u0006-"}, d2 = {"Lnd0/i$a;", "", "Ln20/b;", "Lod0/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lo20/s2;", "documentVMS", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "showInactiveDocumentDialog", "updateDocument", "onVerificationClick", "onDeleteClick", "<init>", "(Ln20/b;Ler/a;Lo20/s2;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "g", "()Ln20/b;", "b", "Ler/a;", "c", "()Ler/a;", "Lo20/s2;", "()Lo20/s2;", "d", "Ler/l;", "()Ler/l;", "e", "f", "h", "schoolcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<od0.i> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showInactiveDocumentDialog;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocument;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVerificationClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<od0.i> state, er.a<i0> aVar, s2 s2Var, l<? super n20.a, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onBackAction = aVar;
            this.documentVMS = s2Var;
            this.dispatchAction = lVar;
            this.showInactiveDocumentDialog = aVar2;
            this.updateDocument = aVar3;
            this.onVerificationClick = aVar4;
            this.onDeleteClick = aVar5;
        }

        public final l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onDeleteClick;
        }

        public final er.a<i0> e() {
            return this.onVerificationClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.documentVMS, params.documentVMS) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.showInactiveDocumentDialog, params.showInactiveDocumentDialog) && t.c(this.updateDocument, params.updateDocument) && t.c(this.onVerificationClick, params.onVerificationClick) && t.c(this.onDeleteClick, params.onDeleteClick);
        }

        public final er.a<i0> f() {
            return this.showInactiveDocumentDialog;
        }

        public final State<od0.i> g() {
            return this.state;
        }

        public final er.a<i0> h() {
            return this.updateDocument;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.documentVMS.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.showInactiveDocumentDialog.hashCode()) * 31) + this.updateDocument.hashCode()) * 31) + this.onVerificationClick.hashCode()) * 31) + this.onDeleteClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", documentVMS=" + this.documentVMS + ", dispatchAction=" + this.dispatchAction + ", showInactiveDocumentDialog=" + this.showInactiveDocumentDialog + ", updateDocument=" + this.updateDocument + ", onVerificationClick=" + this.onVerificationClick + ", onDeleteClick=" + this.onDeleteClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134289a;

        static {
            int[] iArr = new int[vf0.c.values().length];
            try {
                iArr[vf0.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf0.c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf0.c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f134289a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f134290a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(871105620);
            if (p076m2.t.k()) {
                p076m2.t.o(871105620, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.mapper.SchoolCardMapper.mapToDocumentScreenState.<anonymous> (SchoolCardMapper.kt:124)");
            }
            long hologramTextColor = ((SetHologramTextThemeColor) rVar.N(md0.d.e())).getHologramTextColor();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(hologramTextColor);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f134291a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(144306556);
            if (p076m2.t.k()) {
                p076m2.t.o(144306556, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.mapper.SchoolCardMapper.mapToDocumentScreenState.<anonymous> (SchoolCardMapper.kt:149)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f134292a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(30696061);
            if (p076m2.t.k()) {
                p076m2.t.o(30696061, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.mapper.SchoolCardMapper.mapToDocumentScreenState.<anonymous> (SchoolCardMapper.kt:150)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    public i(mx.c cVar, ez.e eVar, p20.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.giloshMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(od0.i.e eVar, Params params) {
        int i15 = b.f134289a[eVar.getSchoolCardData().getDocumentStatus().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                params.f().a();
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                params.h().a();
            }
        }
        return i0.f148189a;
    }

    private final DefaultSingleCardData G(Label title, Label value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(title, null, null, 3, null), new n50.b.Title(n50.l.b(value, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J() {
        return i0.f148189a;
    }

    private final String m(School school) {
        return school.getHeadmasterFirstName() + " " + school.getHeadmasterLastName();
    }

    private final String q(SchoolCardDataContainer schoolCardDataContainer) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(schoolCardDataContainer.getFirstName());
        String secondName = schoolCardDataContainer.getSecondName();
        if (secondName != null) {
            sb5.append(" ");
            sb5.append(secondName);
        }
        return sb5.toString();
    }

    private final String r(Address address) {
        StringBuilder sb5 = new StringBuilder();
        String street = address.getStreet();
        if (street == null) {
            street = address.getCity();
        }
        sb5.append(street);
        sb5.append(" ");
        sb5.append(address.getBuildingNumber());
        String flatNumber = address.getFlatNumber();
        if (flatNumber != null) {
            sb5.append('/' + flatNumber);
        }
        sb5.append(", ");
        sb5.append(address.getZipCode());
        sb5.append(" ");
        sb5.append(address.getCity());
        return sb5.toString();
    }

    private final od0.j.a.Initialized u(od0.i.e eVar, final od0.i.e eVar2, final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(jd0.b.f101875v), null, null, null, 28, null), null, null, null, null, 61, null);
        p20.c cVar = this.giloshMapper;
        List listQ = v.q(new u2.Flag(k.Poland, this.labelProvider.c(jd0.b.f101862i)), new u2.Hologram(null, c.f134290a, 1, null));
        State<od0.i> stateG = params.g();
        o20.p.Custom custom = new o20.p.Custom(new p() { // from class: nd0.d
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(i.v((r) obj, ((Integer) obj2).intValue()));
            }
        }, new p() { // from class: nd0.e
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Integer.valueOf(i.x((r) obj, ((Integer) obj2).intValue()));
            }
        });
        Bitmap imageBitmap = eVar.getImageBitmap();
        Label labelC = this.labelProvider.c(jd0.b.f101869p);
        boolean z15 = eVar2.getSchoolCardData().getDocumentStatus() == vf0.c.ACTIVE;
        Label labelC2 = b.f134289a[eVar2.getSchoolCardData().getDocumentStatus().ordinal()] == 1 ? this.labelProvider.c(jd0.b.f101867n) : this.labelProvider.c(jd0.b.f101865l);
        Label labelC3 = this.labelProvider.c(jd0.b.f101861h);
        KeyValueData keyValueData = new KeyValueData(mx.b.d(q(eVar2.getSchoolCardData().getScopeData().getContainer()), "name"), this.labelProvider.c(jd0.b.f101868o), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(eVar2.getSchoolCardData().getScopeData().getContainer().getLastName(), "lastName"), this.labelProvider.c(jd0.b.f101871r), false, 4, null);
        Label labelC4 = this.labelProvider.c(jd0.b.f101864k);
        ez.e eVar3 = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(eVar2.getSchoolCardData().getScopeData().getContainer().getDateOfBirth());
        fz.c cVar2 = fz.c.DOTTED;
        return new od0.j.a.Initialized(baseScaffoldData, new BaseDocumentData(null, null, null, cVar.b(new p20.c.Params(listQ, stateG, custom, imageBitmap, labelC, null, null, z15, labelC2, labelC3, new er.a() { // from class: nd0.f
            @Override // er.a
            public final Object a() {
                return i.z(eVar2, params);
            }
        }, v.q(keyValueData, keyValueData2, new KeyValueData(mx.b.d(eVar3.d(localDate, cVar2), "dateOfBirth"), labelC4, false, 4, null), new KeyValueData(mx.b.d(eVar2.getSchoolCardData().getScopeData().getContainer().getPesel(), "pesel"), this.labelProvider.c(jd0.b.f101870q), false, 4, null), new KeyValueData(mx.b.d(eVar2.getSchoolCardData().getScopeData().getContainer().getNumber(), "schoolCardNumber"), this.labelProvider.c(jd0.b.I), false, 4, null), new KeyValueData(mx.b.d(this.dateFormatter.d(new fz.b.LocalDate(eVar2.getSchoolCardData().getScopeData().getContainer().getIssueDate()), cVar2), "distributionDate"), this.labelProvider.c(jd0.b.J), false, 4, null), new KeyValueData(mx.b.d(this.dateFormatter.d(new fz.b.LocalDate(eVar2.getSchoolCardData().getScopeData().getContainer().getExpirationDate()), cVar2), "expirationDate"), this.labelProvider.c(jd0.b.K), false, 4, null)), d.f134291a, e.f134292a, params.a(), params.getDocumentVMS(), 96, null)), v.s(new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(new SmallCardData(null, this.labelProvider.c(jd0.b.f101876w), null, jz.a.f106785h1, o50.f.c.f142478a, false, params.e(), 37, null), new SmallCardData(null, this.labelProvider.c(jd0.b.f101863j), null, jz.a.f106727a, o50.f.b.f142477a, false, params.d(), 37, null)), new ShortcutMoreData(this.labelProvider.c(jd0.b.f101874u), new l() { // from class: nd0.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.E((List) obj);
            }
        }))), eVar2.getSchoolCardData().getScopeData().getContainer().getDisability() ? new o20.l.Button(G(this.labelProvider.c(jd0.b.H), this.labelProvider.c(jd0.b.A))) : null, new o20.l.Expandable(this.labelProvider.c(jd0.b.f101854a), new CardListData(v.q(G(this.labelProvider.c(jd0.b.F), mx.b.d(eVar2.getSchoolCardData().getScopeData().getContainer().getSchool().getName(), "schoolName")), G(this.labelProvider.c(jd0.b.D), mx.b.d(r(eVar2.getSchoolCardData().getScopeData().getContainer().getSchool().getAddress()), "schoolAddress")), G(this.labelProvider.c(jd0.b.G), mx.b.d(eVar2.getSchoolCardData().getScopeData().getContainer().getSchool().getPhoneNumber(), "schoolPhoneNumber")), G(this.labelProvider.c(jd0.b.E), mx.b.d(m(eVar2.getSchoolCardData().getScopeData().getContainer().getSchool()), "director"))), j0.a.f132074a, false, null, null, 28, null)), new o20.l.UpdateDataItem(this.labelProvider.c(jd0.b.f101866m), mx.b.d(this.dateFormatter.d(new fz.b.OffsetDateTime(eVar2.getSchoolCardData().getScopeData().getDh().getTs()), cVar2), "timestamp"), null, null, new er.a() { // from class: nd0.h
            @Override // er.a
            public final Object a() {
                return i.F(eVar2, params);
            }
        }, 8, null)), null, v.e(new c30.b.c(null, null, null, this.labelProvider.c(jd0.b.L), null, null, null, 119, null)), 39, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(r rVar, int i15) {
        rVar.X(837473181);
        if (p076m2.t.k()) {
            p076m2.t.o(837473181, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.mapper.SchoolCardMapper.mapToDocumentScreenState.<anonymous> (SchoolCardMapper.kt:129)");
        }
        int staticDocumentBackgroundLayer = ((SchoolCardThemeDrawable) rVar.N(md0.d.f())).getStaticDocumentBackgroundLayer();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return staticDocumentBackgroundLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(r rVar, int i15) {
        rVar.X(-1201990306);
        if (p076m2.t.k()) {
            p076m2.t.o(-1201990306, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.mapper.SchoolCardMapper.mapToDocumentScreenState.<anonymous> (SchoolCardMapper.kt:130)");
        }
        int dynamicDocumentBackgroundLayer = ((SchoolCardThemeDrawable) rVar.N(md0.d.f())).getDynamicDocumentBackgroundLayer();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return dynamicDocumentBackgroundLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(od0.i.e eVar, Params params) {
        int i15 = b.f134289a[eVar.getSchoolCardData().getDocumentStatus().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                params.f().a();
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                params.h().a();
            }
        }
        return i0.f148189a;
    }

    public final DialogData H(er.a<i0> onDeleteAction, er.a<i0> onCancelAction) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(jd0.b.f101879z), this.labelProvider.c(jd0.b.f101878y), new DialogButtonTextData(this.labelProvider.c(jd0.b.f101859f), null, onDeleteAction, 2, null), new DialogButtonTextData(this.labelProvider.c(jd0.b.f101856c), null, onCancelAction, 2, null), null, null, 96, null);
    }

    public final DialogData I() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(jd0.b.C), this.labelProvider.c(jd0.b.B), new DialogButtonTextData(this.labelProvider.c(jd0.b.f101857d), null, new er.a() { // from class: nd0.c
            @Override // er.a
            public final Object a() {
                return i.J();
            }
        }, 2, null), null, null, null, 112, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public od0.j.a b(Params params) {
        od0.i iVarD = params.g().d();
        if (iVarD instanceof od0.i.ErrorInitial) {
            return new od0.j.a.Error(((od0.i.ErrorInitial) iVarD).getErrorVMSAdapter());
        }
        if (iVarD instanceof od0.i.ErrorLoading) {
            return new od0.j.a.Error(((od0.i.ErrorLoading) iVarD).getErrorVMSAdapter());
        }
        if (iVarD instanceof od0.i.e.Error) {
            return new od0.j.a.Error(((od0.i.e.Error) iVarD).getErrorVMSAdapter());
        }
        if ((iVarD instanceof od0.i.Initial) || (iVarD instanceof od0.i.DeleteDocument)) {
            return od0.j.a.b.f144934a;
        }
        if (!(iVarD instanceof od0.i.e)) {
            throw new oq.p();
        }
        od0.i.e eVar = (od0.i.e) iVarD;
        return u(eVar, eVar, params);
    }
}
