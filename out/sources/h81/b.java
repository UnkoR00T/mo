package h81;

import er.l;
import fr.t;
import g81.State;
import g81.d;
import i50.BaseScaffoldData;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh81/b;", "Lxw/f;", "Lh81/b$a;", "Lg81/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lcl0/d;", "documentType", "Lmx/a;", "e", "(Lcl0/d;)Lmx/a;", "params", "f", "(Lh81/b$a;)Lg81/d$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: h81.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lh81/b$a;", "", "Lg81/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lcl0/d;", "goBackWithResult", "<init>", "(Lg81/c;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg81/c;", "c", "()Lg81/c;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<cl0.d, i0> goBackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super cl0.d, i0> lVar) {
            this.state = state;
            this.onBackAction = aVar;
            this.goBackWithResult = lVar;
        }

        public final l<cl0.d, i0> a() {
            return this.goBackWithResult;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goBackWithResult, params.goBackWithResult);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goBackWithResult.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goBackWithResult=" + this.goBackWithResult + ')';
        }
    }

    /* JADX INFO: renamed from: h81.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1886b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81890a;

        static {
            int[] iArr = new int[cl0.d.values().length];
            try {
                iArr[cl0.d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.d.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cl0.d.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f81890a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(cl0.d documentType) {
        int i15 = C1886b.f81890a[documentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210351i4);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210393o4);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.f210359j5);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, cl0.d dVar) {
        params.a().b(dVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(w51.a.f210366k5), null, null, null, 28, null), null, null, null, null, 61, null);
        wq.a<cl0.d> aVarE = cl0.d.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final cl0.d dVar : aVarE) {
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(e(dVar), null, null, 0, 0, null, 62, null)), null, 5, null);
            x0.Icon iconA = x0.Icon.INSTANCE.a();
            if (params.getState().getSelectedDocumentType() != dVar) {
                iconA = null;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: h81.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, dVar);
                }
            }, false, null, null, false, null, null, bodySection, null, iconA, null, 2813, null));
        }
        return new d.Data(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.b());
    }
}
