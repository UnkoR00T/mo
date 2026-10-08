package ir1;

import b54.c;
import er.p;
import fr.t;
import hr1.State;
import hr1.d;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.l;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lir1/b;", "Lxw/f;", "Lir1/b$a;", "Lhr1/d$a;", "<init>", "()V", "params", "e", "(Lir1/b$a;)Lhr1/d$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: ir1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lir1/b$a;", "", "Lhr1/c;", "state", "Lkotlin/Function2;", "Lb54/c;", "", "Loq/i0;", "onSetFeatureFlag", "Lkotlin/Function0;", "onBack", "<init>", "(Lhr1/c;Ler/p;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhr1/c;", "c", "()Lhr1/c;", "b", "Ler/p;", "()Ler/p;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<c, Boolean, i0> onSetFeatureFlag;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, p<? super c, ? super Boolean, i0> pVar, er.a<i0> aVar) {
            this.state = state;
            this.onSetFeatureFlag = pVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final p<c, Boolean, i0> b() {
            return this.onSetFeatureFlag;
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
            return t.c(this.state, params.state) && t.c(this.onSetFeatureFlag, params.onSetFeatureFlag) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onSetFeatureFlag.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSetFeatureFlag=" + this.onSetFeatureFlag + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 f(Params params, Map.Entry entry, boolean z15) {
        params.b().B(entry.getKey(), Boolean.valueOf(!((Boolean) entry.getValue()).booleanValue()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Feature Flags", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null);
        Set<Map.Entry<c, Boolean>> setEntrySet = params.getState().b().entrySet();
        ArrayList arrayList = new ArrayList(v.y(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new DefaultSingleCardData("Card_" + ((c) entry.getKey()).getSerializedName(), null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(mx.b.b(((c) entry.getKey()).getSerializedName(), ""), null, null, 3, null)), null, 5, null), null, new x0.Switch(new s50.a.C4550a(null, ((Boolean) entry.getValue()).booleanValue(), false, new er.l() { // from class: ir1.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.f(params, entry, ((Boolean) obj).booleanValue());
                }
            }, null, null, null, false, 245, null)), null, 2814, null));
        }
        return new d.Data(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
