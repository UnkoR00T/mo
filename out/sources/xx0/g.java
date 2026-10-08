package xx0;

import android.graphics.Bitmap;
import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import mx.Label;
import mz3.z;
import n20.State;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.p;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0013B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxx0/g;", "Lxw/f;", "Lxx0/g$b;", "Lyx0/k$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp20/c;", "giloshMapper", "<init>", "(Lmx/c;Lez/e;Lp20/c;)V", "Lyx0/j$b;", "params", "Lo20/k;", "l", "(Lyx0/j$b;Lxx0/g$b;)Lo20/k;", "i", "(Lxx0/g$b;)Lyx0/k$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lp20/c;", "d", "advocatecard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, yx0.k.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f221747e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: xx0.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b)\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001d\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b!\u0010+¨\u0006,"}, d2 = {"Lxx0/g$b;", "", "Ln20/b;", "Lyx0/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirmDataClick", "Lkotlin/Function1;", "Lmz3/z$b;", "onUpdateDataClick", "onDeleteClick", "onBackAction", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "<init>", "(Ln20/b;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Lo20/s2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "g", "()Ln20/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "e", "Lo20/s2;", "()Lo20/s2;", "advocatecard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<yx0.j> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmDataClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<z.b, i0> onUpdateDataClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<yx0.j> state, er.a<i0> aVar, er.l<? super z.b, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.l<? super n20.a, i0> lVar2, s2 s2Var) {
            this.state = state;
            this.onConfirmDataClick = aVar;
            this.onUpdateDataClick = lVar;
            this.onDeleteClick = aVar2;
            this.onBackAction = aVar3;
            this.dispatchAction = lVar2;
            this.documentVMS = s2Var;
        }

        public final er.l<n20.a, i0> a() {
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
            return this.onConfirmDataClick;
        }

        public final er.a<i0> e() {
            return this.onDeleteClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onConfirmDataClick, params.onConfirmDataClick) && t.c(this.onUpdateDataClick, params.onUpdateDataClick) && t.c(this.onDeleteClick, params.onDeleteClick) && t.c(this.onBackAction, params.onBackAction) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.documentVMS, params.documentVMS);
        }

        public final er.l<z.b, i0> f() {
            return this.onUpdateDataClick;
        }

        public final State<yx0.j> g() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onConfirmDataClick.hashCode()) * 31) + this.onUpdateDataClick.hashCode()) * 31) + this.onDeleteClick.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.documentVMS.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirmDataClick=" + this.onConfirmDataClick + ", onUpdateDataClick=" + this.onUpdateDataClick + ", onDeleteClick=" + this.onDeleteClick + ", onBackAction=" + this.onBackAction + ", dispatchAction=" + this.dispatchAction + ", documentVMS=" + this.documentVMS + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221758a;

        static {
            int[] iArr = new int[vx0.f.values().length];
            try {
                iArr[vx0.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f221758a = iArr;
        }
    }

    public g(mx.c cVar, ez.e eVar, p20.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.giloshMapper = cVar2;
    }

    private final BaseDocumentData l(yx0.j.Initialized initialized, final Params params) {
        p20.c cVar = this.giloshMapper;
        List listQ = v.q(new u2.Flag(e20.k.Poland, this.labelProvider.c(sx0.a.f185201l)), new u2.Hologram(null, null, 3, null));
        State<yx0.j> stateG = params.g();
        p pVarB = p.INSTANCE.b("advocate_card");
        Bitmap imageBitmap = initialized.getImageBitmap();
        Label labelC = this.labelProvider.c(sx0.a.f185207r);
        boolean z15 = initialized.getData().getStatus() == vx0.f.ACTIVE;
        Label labelC2 = c.f221758a[initialized.getData().getStatus().ordinal()] == 1 ? this.labelProvider.c(sx0.a.f185205p) : this.labelProvider.c(sx0.a.f185203n);
        Label labelC3 = this.labelProvider.c(sx0.a.f185199j);
        Label label = labelC2;
        er.a aVar = new er.a() { // from class: xx0.c
            @Override // er.a
            public final Object a() {
                return g.m(params);
            }
        };
        KeyValueData keyValueData = new KeyValueData(mx.b.b(initialized.getData().e(), "names"), this.labelProvider.c(sx0.a.f185206q), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.b(initialized.getData().getUserData().getSurname(), "surname"), this.labelProvider.c(sx0.a.f185208s), false, 4, null);
        Label labelC4 = this.labelProvider.c(sx0.a.f185192c);
        String permissionType = initialized.getData().getScope().getData().getPermissionType();
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(permissionType != null ? permissionType.toUpperCase(Locale.ROOT) : null, "permissionType"), labelC4, false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d(initialized.getData().getScope().getData().getNumber(), "entryNumber"), this.labelProvider.c(sx0.a.f185191b), false, 4, null);
        Label labelC5 = this.labelProvider.c(sx0.a.f185190a);
        String memberInstitution = initialized.getData().getScope().getData().getMemberInstitution();
        DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, stateG, pVarB, imageBitmap, labelC, null, null, z15, label, labelC3, aVar, v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(mx.b.d(memberInstitution != null ? memberInstitution.toUpperCase(Locale.ROOT) : null, "memberInstitution"), labelC5, false, 4, null)), null, null, params.a(), params.getDocumentVMS(), 12384, null));
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(new SmallCardData(null, this.labelProvider.c(sx0.a.f185209t), null, jz.a.f106785h1, o50.f.c.f142478a, false, params.d(), 37, null), new SmallCardData(null, this.labelProvider.c(sx0.a.f185202m), null, jz.a.f106727a, o50.f.b.f142477a, false, new er.a() { // from class: xx0.d
            @Override // er.a
            public final Object a() {
                return g.q(params);
            }
        }, 37, null)), new ShortcutMoreData(this.labelProvider.c(sx0.a.f185210u), new er.l() { // from class: xx0.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.r((List) obj);
            }
        })));
        Label labelC6 = this.labelProvider.c(sx0.a.f185204o);
        String ts4 = initialized.getData().getScope().getDataHeaderStandard().getTs();
        return new BaseDocumentData(null, null, null, documentGiloshDataB, v.s(shortcuts, new o20.l.UpdateDataItem(labelC6, mx.b.d(ts4 != null ? this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, "dataHeaderTs"), this.labelProvider.c(sx0.a.f185200k), null, new er.a() { // from class: xx0.f
            @Override // er.a
            public final Object a() {
                return g.s(params);
            }
        }, 8, null)), null, v.e(new c30.b.c(null, null, null, this.labelProvider.c(sx0.a.f185193d), null, null, null, 119, null)), 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.f().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.f().b(z.b.UPDATE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public yx0.k.a b(Params params) {
        Label labelN;
        yx0.j jVarD = params.g().d();
        if (!(jVarD instanceof yx0.j.Initialized)) {
            if (jVarD instanceof yx0.j.a) {
                return yx0.k.a.C6181a.f230191a;
            }
            throw new oq.p();
        }
        yx0.j.Initialized initialized = (yx0.j.Initialized) jVarD;
        BaseDocumentData baseDocumentDataL = l(initialized, params);
        String documentShortName = initialized.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(sx0.a.f185194e).n("title");
        }
        return new yx0.k.a.Initialized(baseDocumentDataL, new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
