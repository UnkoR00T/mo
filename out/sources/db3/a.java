package db3;

import android.text.Spanned;
import cb3.State;
import eb3.ProfileDisplayable;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldb3/a;", "Lxw/f;", "Ldb3/a$a;", "Lcb3/f$a;", "<init>", "()V", "params", "c", "(Ldb3/a$a;)Lcb3/f$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, cb3.f.Data> {

    /* JADX INFO: renamed from: db3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Ldb3/a$a;", "", "Lcb3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "", "onUrlClick", "<init>", "(Lcb3/e;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb3/e;", "c", "()Lcb3/e;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = state;
            this.onClose = aVar;
            this.onUrlClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final l<String, i0> b() {
            return this.onUrlClick;
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onUrlClick, params.onUrlClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onUrlClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onUrlClick=" + this.onUrlClick + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public cb3.f.Data b(Params params) {
        State state = params.getState();
        ArrayList arrayList = null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        Label labelB = b.b(state.getData().getTitle(), "title");
        Spanned summary = state.getData().getSummary();
        Spanned content = state.getData().getContent();
        List<ProfileDisplayable.SubProfileDisplayable> listB = state.getData().b();
        if (listB.isEmpty()) {
            listB = null;
        }
        if (listB != null) {
            List<ProfileDisplayable.SubProfileDisplayable> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                ProfileDisplayable.SubProfileDisplayable subProfileDisplayable = (ProfileDisplayable.SubProfileDisplayable) obj;
                arrayList.add(new cb3.f.Data.Section(b.b(subProfileDisplayable.getTitle(), "subProfileTitle_" + i15), subProfileDisplayable.getDescription()));
                i15 = i16;
            }
        }
        return new cb3.f.Data(baseScaffoldData, labelB, summary, content, arrayList, params.b());
    }
}
