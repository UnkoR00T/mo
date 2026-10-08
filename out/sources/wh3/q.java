package wh3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwh3/q;", "Ll00/e;", "Lwh3/q$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface q extends l00.e<Data> {

    /* JADX INFO: renamed from: wh3.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001f\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b$\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b'\u0010.¨\u0006/"}, d2 = {"Lwh3/q$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "description", "Ly30/n$b;", "controllersData", "Lzh3/a;", "screenSectionsModel", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ly30/n$b;Lzh3/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "Ly30/n$b;", "()Ly30/n$b;", "e", "Lzh3/a;", "f", "()Lzh3/a;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f213449h = y30.n.Switch.f223693f | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch controllersData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final zh3.a screenSectionsModel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, y30.n.Switch r15, zh3.a aVar, ButtonData buttonData, er.a<oq.i0> aVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.description = label2;
            this.controllersData = r15;
            this.screenSectionsModel = aVar;
            this.nextButtonData = buttonData;
            this.onBack = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y30.n.Switch getControllersData() {
            return this.controllersData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<oq.i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.controllersData, data.controllersData) && fr.t.c(this.screenSectionsModel, data.screenSectionsModel) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.onBack, data.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final zh3.a getScreenSectionsModel() {
            return this.screenSectionsModel;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.controllersData.hashCode()) * 31) + this.screenSectionsModel.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", description=" + this.description + ", controllersData=" + this.controllersData + ", screenSectionsModel=" + this.screenSectionsModel + ", nextButtonData=" + this.nextButtonData + ", onBack=" + this.onBack + ')';
        }
    }
}
