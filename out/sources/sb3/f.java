package sb3;

import java.util.List;
import p071kotlin.Metadata;
import vb3.ParticipantUIData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsb3/f;", "", "a", "Lsb3/f$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: sb3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lsb3/f$a;", "Lsb3/f;", "Lvb3/c;", "userData", "", "childrenData", "Lhz/b;", "validationState", "", "scrollToError", "<init>", "(Lvb3/c;Ljava/util/List;Lhz/b;Z)V", "a", "(Lvb3/c;Ljava/util/List;Lhz/b;Z)Lsb3/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lvb3/c;", "e", "()Lvb3/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lhz/b;", "f", "()Lhz/b;", "d", "Z", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParticipantUIData userData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ParticipantUIData> childrenData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToError;

        public Initialized(ParticipantUIData participantUIData, List<ParticipantUIData> list, hz.b bVar, boolean z15) {
            this.userData = participantUIData;
            this.childrenData = list;
            this.validationState = bVar;
            this.scrollToError = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, ParticipantUIData participantUIData, List list, hz.b bVar, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                participantUIData = initialized.userData;
            }
            if ((i15 & 2) != 0) {
                list = initialized.childrenData;
            }
            if ((i15 & 4) != 0) {
                bVar = initialized.validationState;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.scrollToError;
            }
            return initialized.a(participantUIData, list, bVar, z15);
        }

        public final Initialized a(ParticipantUIData userData, List<ParticipantUIData> childrenData, hz.b validationState, boolean scrollToError) {
            return new Initialized(userData, childrenData, validationState, scrollToError);
        }

        public final List<ParticipantUIData> c() {
            return this.childrenData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getScrollToError() {
            return this.scrollToError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ParticipantUIData getUserData() {
            return this.userData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.userData, initialized.userData) && fr.t.c(this.childrenData, initialized.childrenData) && fr.t.c(this.validationState, initialized.validationState) && this.scrollToError == initialized.scrollToError;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public int hashCode() {
            return (((((this.userData.hashCode() * 31) + this.childrenData.hashCode()) * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.scrollToError);
        }

        public String toString() {
            return "Initialized(userData=" + this.userData + ", childrenData=" + this.childrenData + ", validationState=" + this.validationState + ", scrollToError=" + this.scrollToError + ')';
        }

        public /* synthetic */ Initialized(ParticipantUIData participantUIData, List list, hz.b bVar, boolean z15, int i15, fr.k kVar) {
            this(participantUIData, list, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 8) != 0 ? false : z15);
        }
    }
}
