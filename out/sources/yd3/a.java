package yd3;

import fr.t;
import p071kotlin.Metadata;
import sv0.CollisionCreatedDescription;
import sv0.CollisionOtherSidePersonalData;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lyd3/a;", "", "Lsv0/k;", "a", "()Lsv0/k;", "otherSidePersonalData", "Lsv0/y;", "e", "()Lsv0/y;", "processId", "", "b", "()Z", "isAuthor", "Lyd3/a$a;", "Lyd3/a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: yd3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001f¨\u0006!"}, d2 = {"Lyd3/a$a;", "Lyd3/a;", "Lsv0/i;", "collisionCreatedDescription", "Lsv0/y;", "processId", "<init>", "(Lsv0/i;Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/i;", "c", "()Lsv0/i;", "b", "Lsv0/y;", "e", "()Lsv0/y;", "Z", "()Z", "isAuthor", "Lsv0/k;", "()Lsv0/k;", "otherSidePersonalData", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfAuthor implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CollisionCreatedDescription collisionCreatedDescription;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isAuthor;

        public OfAuthor(CollisionCreatedDescription collisionCreatedDescription, ProcessId processId) {
            this.collisionCreatedDescription = collisionCreatedDescription;
            this.processId = processId;
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: a */
        public CollisionOtherSidePersonalData getOtherSidePersonalData() {
            return this.collisionCreatedDescription.getPersonal();
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsAuthor() {
            return this.isAuthor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CollisionCreatedDescription getCollisionCreatedDescription() {
            return this.collisionCreatedDescription;
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfAuthor)) {
                return false;
            }
            OfAuthor ofAuthor = (OfAuthor) other;
            return t.c(this.collisionCreatedDescription, ofAuthor.collisionCreatedDescription) && t.c(this.processId, ofAuthor.processId);
        }

        public int hashCode() {
            return (this.collisionCreatedDescription.hashCode() * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "OfAuthor(collisionCreatedDescription=" + this.collisionCreatedDescription + ", processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lyd3/a$b;", "Lyd3/a;", "Lsv0/k;", "otherSidePersonalData", "Lsv0/y;", "processId", "<init>", "(Lsv0/k;Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/k;", "()Lsv0/k;", "b", "Lsv0/y;", "e", "()Lsv0/y;", "c", "Z", "()Z", "isAuthor", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfReviewer implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CollisionOtherSidePersonalData otherSidePersonalData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isAuthor = true;

        public OfReviewer(CollisionOtherSidePersonalData collisionOtherSidePersonalData, ProcessId processId) {
            this.otherSidePersonalData = collisionOtherSidePersonalData;
            this.processId = processId;
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public CollisionOtherSidePersonalData getOtherSidePersonalData() {
            return this.otherSidePersonalData;
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsAuthor() {
            return this.isAuthor;
        }

        @Override // yd3.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfReviewer)) {
                return false;
            }
            OfReviewer ofReviewer = (OfReviewer) other;
            return t.c(this.otherSidePersonalData, ofReviewer.otherSidePersonalData) && t.c(this.processId, ofReviewer.processId);
        }

        public int hashCode() {
            return (this.otherSidePersonalData.hashCode() * 31) + this.processId.hashCode();
        }

        public String toString() {
            return "OfReviewer(otherSidePersonalData=" + this.otherSidePersonalData + ", processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    CollisionOtherSidePersonalData getOtherSidePersonalData();

    /* JADX INFO: renamed from: b */
    boolean getIsAuthor();

    /* JADX INFO: renamed from: e */
    ProcessId getProcessId();
}
