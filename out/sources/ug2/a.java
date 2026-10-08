package ug2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tg2.LoadingError;
import tg2.b;
import tg2.e;
import tq0.LandRegisterSubDocument;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001b"}, d2 = {"Lug2/a;", "Lxw/f;", "Lug2/a$a;", "Ltg2/e$a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "Llg2/a;", "departmentMapper", "<init>", "(Lmx/c;Ldz/a;Llg2/a;)V", "", "title", "Lmx/a;", "description", "Ln50/g;", "c", "(ILmx/a;)Ln50/g;", "params", "e", "(Lug2/a$a;)Ltg2/e$a;", "a", "Lmx/c;", "b", "Ldz/a;", "Llg2/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lg2.a departmentMapper;

    /* JADX INFO: renamed from: ug2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lug2/a$a;", "", "Ltg2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onGoToPaymentClick", "<init>", "(Ltg2/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltg2/b;", "c", "()Ltg2/b;", "b", "Ler/a;", "()Ler/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToPaymentClick;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onGoToPaymentClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onGoToPaymentClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onGoToPaymentClick, params.onGoToPaymentClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onGoToPaymentClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onGoToPaymentClick=" + this.onGoToPaymentClick + ')';
        }
    }

    public a(c cVar, dz.a aVar, lg2.a aVar2) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
        this.departmentMapper = aVar2;
    }

    private final DefaultSingleCardData c(int title, Label description) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(title), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(description, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        b state = params.getState();
        if (t.c(state, tg2.c.f190091a)) {
            return e.a.c.f190101a;
        }
        if (state instanceof LoadingError) {
            return new e.a.Error(((LoadingError) state).getErrorVMS());
        }
        if (!(state instanceof b.a.Screen) && !(state instanceof b.a.CreatingPayment)) {
            if (state instanceof b.a.CreatingPaymentError) {
                return new e.a.Error(((b.a.CreatingPaymentError) state).getErrorVMS());
            }
            throw new p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.T0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(xf2.a.S0);
        b.a aVar = (b.a) state;
        DefaultSingleCardData defaultSingleCardDataC = c(xf2.a.P0, mx.b.b(c0.e(aVar.getMyRegistry().getNumber()), "number"));
        DefaultSingleCardData defaultSingleCardDataC2 = c(xf2.a.Q0, this.labelProvider.c(lg2.c.b(aVar.getSelectedDocument())));
        lg2.a aVar2 = this.departmentMapper;
        Set<LandRegisterSubDocument> setZ0 = aVar.z0();
        ArrayList arrayList = new ArrayList(v.y(setZ0, 10));
        Iterator<T> it = setZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(((LandRegisterSubDocument) it.next()).getSubtype());
        }
        String strB = aVar2.b(arrayList);
        return new e.a.Content(aVarA, baseScaffoldData, labelC, new CardListData(v.s(defaultSingleCardDataC, defaultSingleCardDataC2, strB != null ? c(xf2.a.R0, mx.b.b(strB, "department")) : null, c(xf2.a.f218343a, mx.b.b(this.currencyFormatter.b(aVar.getCalculatedAmount(), "PLN"), "amount"))), null, false, null, null, 30, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.K0), null, 2, null), d.a.f107773a, null, params.b(), 35, null));
    }
}
