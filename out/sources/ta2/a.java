package ta2;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import sa2.i;
import sa2.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lta2/a;", "Lxw/f;", "Lta2/a$a;", "Lsa2/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/g;", "c", "(Lmx/a;Ler/a;)Ln50/g;", "params", "Lsa2/j$a$a;", "e", "(Lta2/a$a;)Lsa2/j$a$a;", "a", "Lmx/c;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ta2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lta2/a$a;", "", "Lsa2/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onVerificationClick", "onDataTransferClick", "onActivityClick", "onLoginToAppClick", "onBackPressed", "<init>", "(Lsa2/i;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsa2/i;", "f", "()Lsa2/i;", "b", "Ler/a;", "e", "()Ler/a;", "c", "d", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVerificationClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDataTransferClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onActivityClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLoginToAppClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        public Params(i iVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = iVar;
            this.onVerificationClick = aVar;
            this.onDataTransferClick = aVar2;
            this.onActivityClick = aVar3;
            this.onLoginToAppClick = aVar4;
            this.onBackPressed = aVar5;
        }

        public final er.a<i0> a() {
            return this.onActivityClick;
        }

        public final er.a<i0> b() {
            return this.onBackPressed;
        }

        public final er.a<i0> c() {
            return this.onDataTransferClick;
        }

        public final er.a<i0> d() {
            return this.onLoginToAppClick;
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
            return t.c(this.state, params.state) && t.c(this.onVerificationClick, params.onVerificationClick) && t.c(this.onDataTransferClick, params.onDataTransferClick) && t.c(this.onActivityClick, params.onActivityClick) && t.c(this.onLoginToAppClick, params.onLoginToAppClick) && t.c(this.onBackPressed, params.onBackPressed);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final i getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onVerificationClick.hashCode()) * 31) + this.onDataTransferClick.hashCode()) * 31) + this.onActivityClick.hashCode()) * 31) + this.onLoginToAppClick.hashCode()) * 31) + this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onVerificationClick=" + this.onVerificationClick + ", onDataTransferClick=" + this.onDataTransferClick + ", onActivityClick=" + this.onActivityClick + ", onLoginToAppClick=" + this.onLoginToAppClick + ", onBackPressed=" + this.onBackPressed + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(Label title, er.a<i0> onClick) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.a.Initialized b(Params params) {
        i state = params.getState();
        if (!(state instanceof i.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(x92.a.f217634z), null, null, null, 28, null), null, null, null, null, 61, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c(this.labelProvider.c(x92.a.f217630v), params.e()));
        arrayList.add(c(this.labelProvider.c(x92.a.f217628t), params.c()));
        arrayList.add(c(this.labelProvider.c(x92.a.f217629u), params.d()));
        if (!((i.Initialized) state).getExcludeItems()) {
            arrayList.add(c(this.labelProvider.c(x92.a.f217627s), params.a()));
        }
        return new j.a.Initialized(baseScaffoldData, arrayList);
    }
}
