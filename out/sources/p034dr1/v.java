package p034dr1;

import er.a;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.c;
import k30.d;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldr1/v;", "Lxw/f;", "Ldr1/v$a;", "Ldr1/p$a;", "<init>", "()V", "params", "c", "(Ldr1/v$a;)Ldr1/p$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements f<Params, p.Data> {

    /* JADX INFO: renamed from: dr1.v$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Ldr1/v$a;", "", "Ldr1/o;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackButtonClick", "onSmallButtonClick", "onMediumButtonClick", "onLargeButtonClick", "<init>", "(Ldr1/o;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldr1/o;", "getState", "()Ldr1/o;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<i0> onBackButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<i0> onSmallButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<i0> onMediumButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<i0> onLargeButtonClick;

        public Params(o oVar, a<i0> aVar, a<i0> aVar2, a<i0> aVar3, a<i0> aVar4) {
            this.state = oVar;
            this.onBackButtonClick = aVar;
            this.onSmallButtonClick = aVar2;
            this.onMediumButtonClick = aVar3;
            this.onLargeButtonClick = aVar4;
        }

        public final a<i0> a() {
            return this.onBackButtonClick;
        }

        public final a<i0> b() {
            return this.onLargeButtonClick;
        }

        public final a<i0> c() {
            return this.onMediumButtonClick;
        }

        public final a<i0> d() {
            return this.onSmallButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackButtonClick, params.onBackButtonClick) && t.c(this.onSmallButtonClick, params.onSmallButtonClick) && t.c(this.onMediumButtonClick, params.onMediumButtonClick) && t.c(this.onLargeButtonClick, params.onLargeButtonClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackButtonClick.hashCode()) * 31) + this.onSmallButtonClick.hashCode()) * 31) + this.onMediumButtonClick.hashCode()) * 31) + this.onLargeButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackButtonClick=" + this.onBackButtonClick + ", onSmallButtonClick=" + this.onSmallButtonClick + ", onMediumButtonClick=" + this.onMediumButtonClick + ", onLargeButtonClick=" + this.onLargeButtonClick + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), b.b("TopAppBar", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        d.a aVar = d.a.f107773a;
        return new p.Data(baseScaffoldData, new ButtonData(null, null, large, new c.WithText(b.b("Small", ""), null, 2, null), aVar, null, params.d(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new c.WithText(b.b("Medium", ""), null, 2, null), aVar, null, params.c(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new c.WithText(b.b("Large", ""), null, 2, null), aVar, null, params.b(), 35, null));
    }
}
