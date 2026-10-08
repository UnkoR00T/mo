package qg2;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pg2.c;
import pq.v;
import tq0.LandRegisterDocument;
import tq0.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqg2/b;", "Lxw/f;", "Lqg2/b$a;", "Lpg2/c$a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Ldz/a;)V", "params", "f", "(Lqg2/b$a;)Lpg2/c$a;", "Ltq0/p;", "", "e", "(Ltq0/p;)I", "a", "Lmx/c;", "b", "Ldz/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: qg2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lqg2/b$a;", "", "Lpg2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "Ltq0/p;", "onSelectedItem", "<init>", "(Lpg2/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpg2/b;", "c", "()Lpg2/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final pg2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<LandRegisterDocument, i0> onSelectedItem;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(pg2.b bVar, er.a<i0> aVar, l<? super LandRegisterDocument, i0> lVar) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onSelectedItem = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<LandRegisterDocument, i0> b() {
            return this.onSelectedItem;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final pg2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onSelectedItem, params.onSelectedItem);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onSelectedItem.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onSelectedItem=" + this.onSelectedItem + ')';
        }
    }

    /* JADX INFO: renamed from: qg2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4175b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166389a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.Extract.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f166389a = iArr;
        }
    }

    public b(mx.c cVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, LandRegisterDocument landRegisterDocument) {
        params.b().b(landRegisterDocument);
        return i0.f148189a;
    }

    public final int e(LandRegisterDocument landRegisterDocument) {
        return C4175b.f166389a[landRegisterDocument.getType().ordinal()] == 1 ? xf2.a.f218349c : xf2.a.f218346b;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        pg2.b state = params.getState();
        if (t.c(state, pg2.b.C3898b.f157465a)) {
            return c.a.C3899a.f157467a;
        }
        if (!(state instanceof pg2.b.Initialized)) {
            if (state instanceof pg2.b.Error) {
                return new c.a.Error(((pg2.b.Error) state).getError());
            }
            throw new p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.I0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(xf2.a.H0);
        List<LandRegisterDocument> listA = ((pg2.b.Initialized) state).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final LandRegisterDocument landRegisterDocument = (LandRegisterDocument) obj;
            String str = "type_" + i15;
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(lg2.c.b(landRegisterDocument)), null, null, 0, 0, null, 62, null));
            BigDecimal amount = landRegisterDocument.getAmount();
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: qg2.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, landRegisterDocument);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, amount != null ? new SingleCardLabel(mx.b.b(this.labelProvider.c(e(landRegisterDocument)).getText() + ' ' + this.currencyFormatter.b(amount, "PLN"), "description"), null, null, 0, 0, null, 62, null) : null, 1, null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
            i15 = i16;
        }
        return new c.a.Initialized(aVarA, baseScaffoldData, labelC, arrayList);
    }
}
