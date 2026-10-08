package u91;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu91/e;", "Lxw/f;", "Lu91/e$a;", "Lu91/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Li61/h;", "", "e", "(Li61/h;)I", "params", "f", "(Lu91/e$a;)Lu91/c$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: u91.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lu91/e$a;", "", "Lu91/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Li61/h;", "goBackWithResult", "<init>", "(Lu91/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu91/b;", "c", "()Lu91/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<i61.h, i0> goBackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.l<? super i61.h, i0> lVar) {
            this.state = state;
            this.onBackAction = aVar;
            this.goBackWithResult = lVar;
        }

        public final er.l<i61.h, i0> a() {
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196591a;

        static {
            int[] iArr = new int[i61.h.values().length];
            try {
                iArr[i61.h.MEDICAL_EMERGENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i61.h.OCCUPATIONAL_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i61.h.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i61.h.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i61.h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i61.h.FUNERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f196591a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(i61.h hVar) {
        switch (b.f196591a[hVar.ordinal()]) {
            case 1:
                return w51.a.M1;
            case 2:
                return w51.a.N1;
            case 3:
                return w51.a.O1;
            case 4:
                return w51.a.P1;
            case 5:
                return w51.a.K1;
            case 6:
                return w51.a.L1;
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, i61.h hVar) {
        params.a().b(hVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(w51.a.Q1), null, null, null, 28, null), null, null, null, null, 61, null);
        wq.a<i61.h> aVarE = i61.h.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final i61.h hVar : aVarE) {
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e(hVar)), null, null, 0, 0, null, 62, null)), null, 5, null);
            x0.Icon iconA = x0.Icon.INSTANCE.a();
            if (params.getState().getSelectedReason() != hVar) {
                iconA = null;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: u91.d
                @Override // er.a
                public final Object a() {
                    return e.h(params, hVar);
                }
            }, false, null, null, false, null, null, bodySection, null, iconA, null, 2813, null));
        }
        return new c.Data(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.b());
    }
}
