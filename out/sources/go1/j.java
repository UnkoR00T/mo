package go1;

import android.graphics.Bitmap;
import er.l;
import fr.t;
import fu.r;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0018B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lgo1/j;", "Lxw/f;", "Lgo1/j$b;", "Lfo1/j$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Ldz/d;", "romanNumeralFormatter", "Lp20/c;", "giloshMapper", "<init>", "(Lmx/c;Lez/e;Ldz/d;Lp20/c;)V", "Lfo1/i$c;", "params", "Lo20/k;", "l", "(Lfo1/i$c;Lgo1/j$b;)Lo20/k;", "i", "(Lgo1/j$b;)Lfo1/j$a;", "Lmx/a;", "h", "()Lmx/a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Ldz/d;", "d", "Lp20/c;", "e", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, fo1.j.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75175f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.d romanNumeralFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: go1.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b)\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001d\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b!\u0010+¨\u0006,"}, d2 = {"Lgo1/j$b;", "", "Ln20/b;", "Lfo1/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirmDataClick", "Lkotlin/Function1;", "Lmz3/z$b;", "onUpdateDataClick", "onDeleteClick", "onBackAction", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "<init>", "(Ln20/b;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Lo20/s2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "g", "()Ln20/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "e", "Lo20/s2;", "()Lo20/s2;", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<fo1.i> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmDataClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z.b, i0> onUpdateDataClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<fo1.i> state, er.a<i0> aVar, l<? super z.b, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super n20.a, i0> lVar2, s2 s2Var) {
            this.state = state;
            this.onConfirmDataClick = aVar;
            this.onUpdateDataClick = lVar;
            this.onDeleteClick = aVar2;
            this.onBackAction = aVar3;
            this.dispatchAction = lVar2;
            this.documentVMS = s2Var;
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

        public final l<z.b, i0> f() {
            return this.onUpdateDataClick;
        }

        public final State<fo1.i> g() {
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
        public static final /* synthetic */ int[] f75187a;

        static {
            int[] iArr = new int[do1.f.values().length];
            try {
                iArr[do1.f.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f75187a = iArr;
        }
    }

    public j(mx.c cVar, ez.e eVar, dz.d dVar, p20.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.romanNumeralFormatter = dVar;
        this.giloshMapper = cVar2;
    }

    private final BaseDocumentData l(fo1.i.c cVar, final Params params) {
        Label labelB;
        Integer numU;
        p20.c cVar2 = this.giloshMapper;
        List listQ = v.q(new u2.Flag(e20.k.Poland, this.labelProvider.c(ho1.a.f85975m)), new u2.Hologram(null, null, 3, null));
        State<fo1.i> stateG = params.g();
        p pVarB = p.INSTANCE.b("deputy_card");
        Bitmap imageBitmap = cVar.getStateData().getImageBitmap();
        Label labelC = this.labelProvider.c(ho1.a.f85981s);
        boolean z15 = cVar.getStateData().getData().getStatus() == do1.f.ACTIVE;
        Label labelC2 = c.f75187a[cVar.getStateData().getData().getStatus().ordinal()] == 1 ? this.labelProvider.c(ho1.a.f85979q) : this.labelProvider.c(ho1.a.f85977o);
        Label labelC3 = this.labelProvider.c(ho1.a.f85966d);
        er.a aVar = new er.a() { // from class: go1.g
            @Override // er.a
            public final Object a() {
                return j.m(params);
            }
        };
        Label labelC4 = this.labelProvider.c(ho1.a.f85980r);
        String names = cVar.getStateData().getData().getScope().getData().getNames();
        Locale locale = Locale.ROOT;
        KeyValueData keyValueData = new KeyValueData(mx.b.b(names.toUpperCase(locale), "names"), labelC4, false, 4, null);
        Label labelC5 = this.labelProvider.c(ho1.a.f85982t);
        String lastName = cVar.getStateData().getData().getScope().getData().getLastName();
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(lastName != null ? lastName.toUpperCase(locale) : null, "lastName"), labelC5, false, 4, null);
        Label labelC6 = this.labelProvider.c(ho1.a.f85970h);
        Label labelC7 = this.labelProvider.c(ho1.a.f85971i);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.b(labelC7.getText().toUpperCase(locale), labelC7.getTag()), labelC6, false, 4, null);
        Label labelC8 = this.labelProvider.c(ho1.a.f85968f);
        String releaseDate = cVar.getStateData().getData().getScope().getData().getReleaseDate();
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d(releaseDate != null ? this.dateFormatter.d(new fz.b.String(releaseDate, fz.c.BLANK_REVERSED, false, 4, null), fz.c.DOTTED) : null, "releaseDate"), labelC8, false, 4, null);
        KeyValueData keyValueData5 = new KeyValueData(mx.b.d(cVar.getStateData().getData().getScope().getData().getNumber(), "dataContainerNumber"), this.labelProvider.c(ho1.a.f85969g), false, 4, null);
        Label labelC9 = this.labelProvider.c(ho1.a.f85973k);
        dz.d dVar = this.romanNumeralFormatter;
        String numberOfParliamentCadence = cVar.getStateData().getData().getScope().getData().getNumberOfParliamentCadence();
        String strA = dVar.a((numberOfParliamentCadence == null || (numU = r.u(numberOfParliamentCadence)) == null) ? 0 : numU.intValue());
        if (strA == null || (labelB = this.labelProvider.e(ho1.a.f85974l, strA)) == null) {
            labelB = Label.INSTANCE.b();
        }
        DocumentGiloshData documentGiloshDataB = cVar2.b(new p20.c.Params(listQ, stateG, pVarB, imageBitmap, labelC, null, null, z15, labelC2, labelC3, aVar, v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, keyValueData5, new KeyValueData(labelB, labelC9, false, 4, null)), null, null, params.a(), params.getDocumentVMS(), 12384, null));
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.q(new SmallCardData(null, this.labelProvider.c(ho1.a.f85983u), null, jz.a.f106785h1, o50.f.c.f142478a, false, params.d(), 37, null), new SmallCardData(null, this.labelProvider.c(ho1.a.f85976n), null, jz.a.f106727a, o50.f.b.f142477a, false, params.e(), 37, null)), new ShortcutMoreData(Label.INSTANCE.c(), new l() { // from class: go1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.q((List) obj);
            }
        })));
        Label labelC10 = this.labelProvider.c(ho1.a.f85978p);
        String ts4 = cVar.getStateData().getData().getScope().getDataHeaderStandard().getTs();
        return new BaseDocumentData(null, null, null, documentGiloshDataB, v.s(shortcuts, new o20.l.UpdateDataItem(labelC10, mx.b.d(ts4 != null ? this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, "dataHeaderTs"), this.labelProvider.c(ho1.a.f85967e), null, new er.a() { // from class: go1.i
            @Override // er.a
            public final Object a() {
                return j.r(params);
            }
        }, 8, null)), null, null, 103, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.f().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.f().b(z.b.UPDATE);
        return i0.f148189a;
    }

    public final Label h() {
        return this.labelProvider.c(ho1.a.f85964b);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public fo1.j.a b(Params params) {
        Label labelN;
        fo1.i iVarD = params.g().d();
        if (iVarD instanceof fo1.i.a) {
            return fo1.j.a.b.f65717a;
        }
        if (!(iVarD instanceof fo1.i.c.DocumentUpdating) && !(iVarD instanceof fo1.i.c.Displaying)) {
            if (iVarD instanceof fo1.i.c.Error) {
                return new fo1.j.a.Error(((fo1.i.c.Error) iVarD).getErrorVMS());
            }
            if (iVarD instanceof fo1.i.InitializationError) {
                return new fo1.j.a.Error(((fo1.i.InitializationError) iVarD).getErrorVMS());
            }
            throw new oq.p();
        }
        fo1.i.c cVar = (fo1.i.c) iVarD;
        String documentShortName = cVar.getStateData().getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(ho1.a.f85972j).n("title");
        }
        return new fo1.j.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, null, null, null, 61, null), l(cVar, params));
    }
}
