package xg3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lxg3/e;", "Ll00/e;", "Lxg3/e$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: xg3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lxg3/e$a;", "", "Li50/a;", "scaffoldData", "Lx70/a;", "loaderData", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lx70/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lx70/a;", "()Lx70/a;", "c", "Lmx/a;", "e", "()Lmx/a;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f218544f = x70.a.f217278b | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final x70.a loaderData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Data(BaseScaffoldData baseScaffoldData, x70.a aVar, Label label, Label label2, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.loaderData = aVar;
            this.title = label;
            this.description = label2;
            this.onBackAction = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x70.a getLoaderData() {
            return this.loaderData;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.loaderData, data.loaderData) && t.c(this.title, data.title) && t.c(this.description, data.description) && t.c(this.onBackAction, data.onBackAction);
        }

        public int hashCode() {
            return (((((((this.scaffoldData.hashCode() * 31) + this.loaderData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", loaderData=" + this.loaderData + ", title=" + this.title + ", description=" + this.description + ", onBackAction=" + this.onBackAction + ')';
        }
    }
}
