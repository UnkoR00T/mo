package ah2;

import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import xw.f;
import zg2.h;
import zg2.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lah2/c;", "Lxw/f;", "Lah2/c$a;", "Lzg2/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lah2/c$a;)Lzg2/i$a;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ah2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Lah2/c$a;", "", "Lzg2/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function2;", "", "Lmx/a;", "copyEmail", "Lkotlin/Function1;", "call", "<init>", "(Lzg2/h;Ler/a;Ler/p;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzg2/h;", "getState", "()Lzg2/h;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/p;", "()Ler/p;", "d", "Ler/l;", "()Ler/l;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, Label, i0> copyEmail;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> call;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, er.a<i0> aVar, p<? super String, ? super Label, i0> pVar, l<? super String, i0> lVar) {
            this.state = hVar;
            this.onBack = aVar;
            this.copyEmail = pVar;
            this.call = lVar;
        }

        public final l<String, i0> a() {
            return this.call;
        }

        public final p<String, Label, i0> b() {
            return this.copyEmail;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.copyEmail, params.copyEmail) && t.c(this.call, params.call);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.copyEmail.hashCode()) * 31) + this.call.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", copyEmail=" + this.copyEmail + ", call=" + this.call + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, mx.c cVar) {
        params.b().B("ekw@ms.gov.pl", cVar.c(xf2.a.T));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().b("71 748 96 00");
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.Data b(final Params params) {
        final mx.c cVar = this.labelProvider;
        er.a<i0> aVarC = params.c();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        j.b.a aVar = j.b.a.f164684d;
        Label labelC = cVar.c(xf2.a.W);
        Label labelC2 = cVar.c(xf2.a.V);
        BodySection bodySection = new BodySection(new SingleCardLabel(cVar.c(xf2.a.f218376l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("ekw@ms.gov.pl", "email"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(cVar.c(xf2.a.f218364h), null, 2, null);
        d.a aVar2 = d.a.f107773a;
        return new i.Data(aVarC, baseScaffoldData, new IconPageData(aVar, labelC, labelC2, null, v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, withText, aVar2, null, new er.a() { // from class: ah2.a
            @Override // er.a
            public final Object a() {
                return c.h(params, cVar);
            }
        }, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(xf2.a.f218394r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b("71 748 96 00", "numberPhone"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(cVar.c(xf2.a.U), null, null, 0, 0, null, 62, null)), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(xf2.a.f218352d), null, 2, null), aVar2, null, new er.a() { // from class: ah2.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, 35, null)), null, 2815, null)), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(xf2.a.f218361g), null, 2, null), aVar2, null, params.c(), 35, null), null, null, 6, null), true, 8, null));
    }
}
