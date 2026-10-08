package nu3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import ju3.ChildData;
import ju3.e;
import mu3.Error;
import mu3.g;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnu3/c;", "Lxw/f;", "Lnu3/c$a;", "Lmu3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Ln50/a;", "f", "(Lmx/a;)Ln50/a;", "params", "h", "(Lnu3/c$a;)Lmu3/g$a;", "a", "Lmx/c;", "choosechild_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nu3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lnu3/c$a;", "", "Lmu3/f;", "state", "Lkotlin/Function1;", "Lju3/e;", "Loq/i0;", "onChildSelected", "Lkotlin/Function0;", "backAction", "closeAction", "<init>", "(Lmu3/f;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmu3/f;", "d", "()Lmu3/f;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "choosechild_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mu3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<e, i0> onChildSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(mu3.f fVar, l<? super e, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = fVar;
            this.onChildSelected = lVar;
            this.backAction = aVar;
            this.closeAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<e, i0> c() {
            return this.onChildSelected;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final mu3.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onChildSelected, params.onChildSelected) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onChildSelected.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onChildSelected=" + this.onChildSelected + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BodySection f(Label label) {
        return new BodySection(null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, ChildData childData) {
        params.c().b(new e.Specific(childData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.c().b(e.b.f106017a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.a b(final Params params) {
        mu3.f state = params.getState();
        if (t.c(state, mu3.e.f128557a)) {
            return g.a.c.f128564a;
        }
        if (state instanceof Error) {
            return new g.a.Error(((Error) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof mu3.f.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), ((mu3.f.Initialized) params.getState()).getChooseChildData().getTitle(), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label header = ((mu3.f.Initialized) params.getState()).getChooseChildData().getHeader();
        List<ChildData> listA = ((mu3.f.Initialized) params.getState()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (final ChildData childData : listA) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: nu3.a
                @Override // er.a
                public final Object a() {
                    return c.i(params, childData);
                }
            }, false, null, null, false, null, null, f(mx.b.b(c0.e(childData.getFirstName()) + ' ' + c0.e(childData.getSurname()), "childData")), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new g.a.Initialized(baseScaffoldData, header, v.M0(arrayList, new DefaultSingleCardData(null, new er.a() { // from class: nu3.b
            @Override // er.a
            public final Object a() {
                return c.l(params);
            }
        }, false, null, null, false, null, null, f(this.labelProvider.c(iu3.a.f97184a)), null, x0.Icon.INSTANCE.b(), null, 2813, null)));
    }
}
