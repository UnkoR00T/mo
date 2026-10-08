package nl3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import kk3.Dictionary;
import ll3.Error;
import ll3.e;
import ll3.g;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnl3/b;", "Lxw/f;", "Lnl3/b$a;", "Lll3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkk3/a;", "", "index", "Lkotlin/Function1;", "Lkk3/b;", "Loq/i0;", "onCardClick", "Ln50/g;", "e", "(Lkk3/a;ILer/l;)Ln50/g;", "params", "h", "(Lnl3/b$a;)Lll3/g$a;", "a", "Lmx/c;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: nl3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lnl3/b$a;", "", "Lll3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "Lkotlin/Function1;", "Lkk3/b;", "onCardClick", "<init>", "(Lll3/f;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lll3/f;", "d", "()Lll3/f;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ll3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<kk3.b, i0> onCardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ll3.f fVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super kk3.b, i0> lVar) {
            this.state = fVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onCardClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<kk3.b, i0> b() {
            return this.onCardClick;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ll3.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onCardClick, params.onCardClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onCardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onCardClick=" + this.onCardClick + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData e(final Dictionary dictionary, int i15, final l<? super kk3.b, i0> lVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: nl3.a
            @Override // er.a
            public final Object a() {
                return b.f(lVar, dictionary);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(dictionary.getDescription(), "CardHeader_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(dictionary.getDescription(), "CardDescription_" + i15), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, Dictionary dictionary) {
        lVar.b(kk3.b.a(dictionary.getCode()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        ll3.f state = params.getState();
        if (state instanceof Error) {
            return new g.a.Error(((Error) params.getState()).getVmsAdapter());
        }
        if (t.c(state, e.f118773a)) {
            return g.a.b.f118776a;
        }
        if (!(state instanceof ll3.f.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fk3.a.f64736x), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(fk3.a.f64735w);
        Label labelC2 = this.labelProvider.c(fk3.a.f64734v);
        List<Dictionary> listA = ((ll3.f.Initialized) params.getState()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(e((Dictionary) obj, i15, params.b()));
            i15 = i16;
        }
        return new g.a.Initialized(baseScaffoldData, labelC, labelC2, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
