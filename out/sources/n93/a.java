package n93;

import b30.AccordionData;
import b30.AccordionElement;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i93.SecurityMalwareDetectedScreenModel;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import l93.e;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.b;
import n50.l;
import oq.i0;
import oq.p;
import oq.r;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln93/a;", "Lxw/f;", "Ln93/a$a;", "Ll93/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "", "tools", "packages", "Ln30/b;", "c", "(Ljava/util/List;Ljava/util/List;)Ln30/b;", "params", "e", "(Ln93/a$a;)Ll93/f$a;", "a", "Lmx/c;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, l93.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: n93.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Ln93/a$a;", "", "Ll93/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onSendEmailClick", "onFindOutMoreClick", "<init>", "(Ll93/e;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll93/e;", "d", "()Ll93/e;", "b", "Ler/a;", "()Ler/a;", "c", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendEmailClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFindOutMoreClick;

        public Params(e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = eVar;
            this.onClose = aVar;
            this.onSendEmailClick = aVar2;
            this.onFindOutMoreClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final er.a<i0> b() {
            return this.onFindOutMoreClick;
        }

        public final er.a<i0> c() {
            return this.onSendEmailClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onSendEmailClick, params.onSendEmailClick) && t.c(this.onFindOutMoreClick, params.onFindOutMoreClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onSendEmailClick.hashCode()) * 31) + this.onFindOutMoreClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onSendEmailClick=" + this.onSendEmailClick + ", onFindOutMoreClick=" + this.onFindOutMoreClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData c(List<String> tools, List<String> packages) {
        ArrayList arrayList = new ArrayList();
        Iterator it = v.p1(tools, packages).iterator();
        int i15 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            r rVar = (r) next;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(d93.a.f40533q), null, null, 3, null), new b.Title(l.b(mx.b.b((String) rVar.c(), "malware_tool_name_" + i15), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(d93.a.f40533q), null, null, 3, null), new b.Title(l.b(mx.b.b((String) rVar.d(), "malware_tool_package_" + i15), null, null, 3, null)), null, 4, null), null, null, null, 3839, null));
            it = it;
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public l93.f.a b(Params params) {
        e state = params.getState();
        if (!(state instanceof e.Initialized)) {
            if (state instanceof e.Error) {
                return new l93.f.a.Error(((e.Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        return new l93.f.a.Initialized(new SecurityMalwareDetectedScreenModel(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.a.f164684d, this.labelProvider.c(d93.a.f40539w), this.labelProvider.c(d93.a.f40531o), null, new SecurityMalwareDetectedScreenModel.ContentData(new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(d93.a.f40528l), null, false, null, false, new m93.b(c(((e.Initialized) params.getState()).getMalwareDataPayload().a(), ((e.Initialized) params.getState()).getMalwareDataPayload().b())), 61, null))), new c30.b.e(null, null, null, this.labelProvider.c(d93.a.f40529m), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(d93.a.f40530n), null, null, params.c(), 13, null)), 55, null)), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(d93.a.f40517a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(d93.a.f40518b), null, 2, null), new d.Secondary(null, 1, null), null, params.b(), 35, null), null, 4, null), true, 8, null)), params.a());
    }
}
