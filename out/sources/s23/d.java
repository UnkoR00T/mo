package s23;

import fr.t;
import i50.BaseScaffoldData;
import m70.TimelineData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ls23/d;", "Ll00/e;", "Ls23/d$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ls23/d$a;", "", "a", "Ls23/d$a$a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: s23.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Ls23/d$a$a;", "Ls23/d$a;", "Li50/a;", "scaffoldData", "Lm70/a;", "timelineData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lm70/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lm70/a;", "c", "()Lm70/a;", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f177698d = TimelineData.f124016b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TimelineData timelineData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public Content(BaseScaffoldData baseScaffoldData, TimelineData timelineData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.timelineData = timelineData;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final TimelineData getTimelineData() {
                return this.timelineData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return t.c(this.scaffoldData, content.scaffoldData) && t.c(this.timelineData, content.timelineData) && t.c(this.onBackAction, content.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.timelineData.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "Content(scaffoldData=" + this.scaffoldData + ", timelineData=" + this.timelineData + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
