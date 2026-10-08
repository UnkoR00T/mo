package wq3;

import fr.t;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import vq3.WhatsNewScreenModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwq3/c;", "Ll00/e;", "Lwq3/c$a;", "a", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwq3/c$a;", "", "a", "b", "Lwq3/c$a$a;", "Lwq3/c$a$b;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: wq3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwq3/c$a$a;", "Lwq3/c$a;", "<init>", "()V", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C5690a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5690a f214473a = new C5690a();

            private C5690a() {
            }
        }

        /* JADX INFO: renamed from: wq3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwq3/c$a$b;", "Lwq3/c$a;", "Lvq3/a;", "model", "<init>", "(Lvq3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvq3/a;", "()Lvq3/a;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f214474b = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WhatsNewScreenModel model;

            public Initialized(WhatsNewScreenModel whatsNewScreenModel) {
                this.model = whatsNewScreenModel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final WhatsNewScreenModel getModel() {
                return this.model;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && t.c(this.model, ((Initialized) other).model);
            }

            public int hashCode() {
                return this.model.hashCode();
            }

            public String toString() {
                return "Initialized(model=" + this.model + ')';
            }
        }
    }
}
