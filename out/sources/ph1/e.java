package ph1;

import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import d40.i;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oh1.DocumentLayoutItem;
import oh1.State;
import oh1.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lph1/e;", "Lxw/f;", "Lph1/e$a;", "Loh1/l$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lah1/b;", "type", "selectedType", "Lkotlin/Function1;", "Loq/i0;", "onChangeLayoutClicked", "Loh1/j;", "i", "(Lah1/b;Lah1/b;Ler/l;)Loh1/j;", "", "m", "(Lah1/b;)I", "q", "params", "r", "(Lph1/e$a;)Loh1/l$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, l.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ph1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u001f¨\u0006#"}, d2 = {"Lph1/e$a;", "", "Loh1/k;", "state", "Lkotlin/Function0;", "Loq/i0;", "onChangeOrderClicked", "onGoToDeletionClick", "Lkotlin/Function1;", "Lah1/b;", "onChangeLayoutClicked", "onBackAction", "<init>", "(Loh1/k;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loh1/k;", "e", "()Loh1/k;", "b", "Ler/a;", "c", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeOrderClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToDeletionClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ah1.b, i0> onChangeLayoutClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super ah1.b, i0> lVar, er.a<i0> aVar3) {
            this.state = state;
            this.onChangeOrderClicked = aVar;
            this.onGoToDeletionClick = aVar2;
            this.onChangeLayoutClicked = lVar;
            this.onBackAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.l<ah1.b, i0> b() {
            return this.onChangeLayoutClicked;
        }

        public final er.a<i0> c() {
            return this.onChangeOrderClicked;
        }

        public final er.a<i0> d() {
            return this.onGoToDeletionClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onChangeOrderClicked, params.onChangeOrderClicked) && t.c(this.onGoToDeletionClick, params.onGoToDeletionClick) && t.c(this.onChangeLayoutClicked, params.onChangeLayoutClicked) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onChangeOrderClicked.hashCode()) * 31) + this.onGoToDeletionClick.hashCode()) * 31) + this.onChangeLayoutClicked.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onChangeOrderClicked=" + this.onChangeOrderClicked + ", onGoToDeletionClick=" + this.onGoToDeletionClick + ", onChangeLayoutClicked=" + this.onChangeLayoutClicked + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157692a;

        static {
            int[] iArr = new int[ah1.b.values().length];
            try {
                iArr[ah1.b.BigCards.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah1.b.SmallCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ah1.b.List.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f157692a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f157693a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1460841325);
            if (p076m2.t.k()) {
                p076m2.t.o(1460841325, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.mapper.DocumentsSettingsMapper.createDocumentLayoutItem.<anonymous> (DocumentsSettingsMapper.kt:109)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DocumentLayoutItem i(final ah1.b type, ah1.b selectedType, final er.l<? super ah1.b, i0> onChangeLayoutClicked) {
        Label labelC;
        int i15 = b.f157692a[type.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(sg1.a.f181530x0);
        } else if (i15 == 2) {
            labelC = this.labelProvider.c(sg1.a.f181536z0);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(sg1.a.f181533y0);
        }
        return new DocumentLayoutItem(labelC, new d40.b.C0864b(null, type == selectedType ? m(type) : q(type), i.l.f39715e, c.f157693a, null, null, 33, null), new RadioButtonItemData(false, type == selectedType, false, 5, null), new er.a() { // from class: ph1.d
            @Override // er.a
            public final Object a() {
                return e.l(onChangeLayoutClicked, type);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.l lVar, ah1.b bVar) {
        lVar.b(bVar);
        return i0.f148189a;
    }

    private final int m(ah1.b type) {
        int i15 = b.f157692a[type.ordinal()];
        if (i15 == 1) {
            return jz.a.f106858r4;
        }
        if (i15 == 2) {
            return jz.a.f106865s4;
        }
        if (i15 == 3) {
            return jz.a.f106872t4;
        }
        throw new oq.p();
    }

    private final int q(ah1.b type) {
        int i15 = b.f157692a[type.ordinal()];
        if (i15 == 1) {
            return jz.a.f106879u4;
        }
        if (i15 == 2) {
            return jz.a.f106886v4;
        }
        if (i15 == 3) {
            return jz.a.f106893w4;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, ah1.b bVar) {
        params.b().b(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, ah1.b bVar) {
        params.b().b(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, ah1.b bVar) {
        params.b().b(bVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(sg1.a.M0), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(sg1.a.L0);
        BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(sg1.a.K0), null, null, 3, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new l.Data(baseScaffoldData, labelC, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(sg1.a.f181527w0), null, null, 3, null)), null, 5, null), null, companion.b(), null, 2813, null), this.labelProvider.c(sg1.a.A0), v.q(i(ah1.b.BigCards, params.getState().getSelectedDocumentsLayoutType(), new er.l() { // from class: ph1.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.s(params, (ah1.b) obj);
            }
        }), i(ah1.b.SmallCard, params.getState().getSelectedDocumentsLayoutType(), new er.l() { // from class: ph1.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.u(params, (ah1.b) obj);
            }
        }), i(ah1.b.List, params.getState().getSelectedDocumentsLayoutType(), new er.l() { // from class: ph1.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.v(params, (ah1.b) obj);
            }
        })), params.a());
    }
}
