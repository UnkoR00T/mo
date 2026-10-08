package yd3;

import fr.t;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.c0;
import sv0.o;
import tv0.BESavedDraftCollision;
import tv0.BEVehicleCollisionDescriptionConception;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lyd3/f;", "", "a", "b", "g", "c", "e", "d", "f", "Lyd3/f$a;", "Lyd3/f$b;", "Lyd3/f$c;", "Lyd3/f$d;", "Lyd3/f$e;", "Lyd3/f$f;", "Lyd3/f$g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lyd3/f$a;", "Lyd3/f;", "Lsv0/y;", "e", "()Lsv0/y;", "processId", "Lsv0/o;", "C", "()Lsv0/o;", "author", "Ltv0/i;", "getDescription", "()Ltv0/i;", "description", "a", "d", "b", "c", "Lyd3/f$a$a;", "Lyd3/f$a$b;", "Lyd3/f$a$c;", "Lyd3/f$a$d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f {

        /* JADX INFO: renamed from: yd3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lyd3/f$a$a;", "Lyd3/f$a;", "Lsv0/y;", "processId", "Lsv0/o;", "author", "Ltv0/i;", "description", "<init>", "(Lsv0/y;Lsv0/o;Ltv0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/o;", "C", "()Lsv0/o;", "c", "Ltv0/i;", "getDescription", "()Ltv0/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Created implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProcessId processId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o author;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEVehicleCollisionDescriptionConception description;

            public Created(ProcessId processId, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
                this.processId = processId;
                this.author = oVar;
                this.description = bEVehicleCollisionDescriptionConception;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: C, reason: from getter */
            public o getAuthor() {
                return this.author;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public ProcessId getProcessId() {
                return this.processId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return t.c(this.processId, created.processId) && this.author == created.author && t.c(this.description, created.description);
            }

            @Override // yd3.f.a
            public BEVehicleCollisionDescriptionConception getDescription() {
                return this.description;
            }

            public int hashCode() {
                return (((this.processId.hashCode() * 31) + this.author.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "Created(processId=" + this.processId + ", author=" + this.author + ", description=" + this.description + ')';
            }
        }

        /* JADX INFO: renamed from: yd3.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lyd3/f$a$b;", "Lyd3/f$a;", "Lsv0/y;", "processId", "Lsv0/o;", "author", "Ltv0/i;", "description", "<init>", "(Lsv0/y;Lsv0/o;Ltv0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/o;", "C", "()Lsv0/o;", "c", "Ltv0/i;", "getDescription", "()Ltv0/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitialInfoConfirmedByMe implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProcessId processId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o author;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEVehicleCollisionDescriptionConception description;

            public InitialInfoConfirmedByMe(ProcessId processId, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
                this.processId = processId;
                this.author = oVar;
                this.description = bEVehicleCollisionDescriptionConception;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: C, reason: from getter */
            public o getAuthor() {
                return this.author;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public ProcessId getProcessId() {
                return this.processId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitialInfoConfirmedByMe)) {
                    return false;
                }
                InitialInfoConfirmedByMe initialInfoConfirmedByMe = (InitialInfoConfirmedByMe) other;
                return t.c(this.processId, initialInfoConfirmedByMe.processId) && this.author == initialInfoConfirmedByMe.author && t.c(this.description, initialInfoConfirmedByMe.description);
            }

            @Override // yd3.f.a
            public BEVehicleCollisionDescriptionConception getDescription() {
                return this.description;
            }

            public int hashCode() {
                return (((this.processId.hashCode() * 31) + this.author.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "InitialInfoConfirmedByMe(processId=" + this.processId + ", author=" + this.author + ", description=" + this.description + ')';
            }
        }

        /* JADX INFO: renamed from: yd3.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lyd3/f$a$c;", "Lyd3/f$a;", "Lsv0/y;", "processId", "Lsv0/o;", "author", "Ltv0/i;", "description", "<init>", "(Lsv0/y;Lsv0/o;Ltv0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/o;", "C", "()Lsv0/o;", "c", "Ltv0/i;", "getDescription", "()Ltv0/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitialInfoRejected implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProcessId processId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o author;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEVehicleCollisionDescriptionConception description;

            public InitialInfoRejected(ProcessId processId, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
                this.processId = processId;
                this.author = oVar;
                this.description = bEVehicleCollisionDescriptionConception;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: C, reason: from getter */
            public o getAuthor() {
                return this.author;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public ProcessId getProcessId() {
                return this.processId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitialInfoRejected)) {
                    return false;
                }
                InitialInfoRejected initialInfoRejected = (InitialInfoRejected) other;
                return t.c(this.processId, initialInfoRejected.processId) && this.author == initialInfoRejected.author && t.c(this.description, initialInfoRejected.description);
            }

            @Override // yd3.f.a
            public BEVehicleCollisionDescriptionConception getDescription() {
                return this.description;
            }

            public int hashCode() {
                return (((this.processId.hashCode() * 31) + this.author.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "InitialInfoRejected(processId=" + this.processId + ", author=" + this.author + ", description=" + this.description + ')';
            }
        }

        /* JADX INFO: renamed from: yd3.f$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006&"}, d2 = {"Lyd3/f$a$d;", "Lyd3/f$a;", "Lsv0/y;", "processId", "Lsv0/o;", "author", "Ltv0/i;", "description", "Lyd3/a;", "confirmationModel", "<init>", "(Lsv0/y;Lsv0/o;Ltv0/i;Lyd3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lsv0/o;", "C", "()Lsv0/o;", "c", "Ltv0/i;", "getDescription", "()Ltv0/i;", "d", "Lyd3/a;", "()Lyd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProcessId processId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o author;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEVehicleCollisionDescriptionConception description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final yd3.a confirmationModel;

            public Initialized(ProcessId processId, o oVar, BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception, yd3.a aVar) {
                this.processId = processId;
                this.author = oVar;
                this.description = bEVehicleCollisionDescriptionConception;
                this.confirmationModel = aVar;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: C, reason: from getter */
            public o getAuthor() {
                return this.author;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final yd3.a getConfirmationModel() {
                return this.confirmationModel;
            }

            @Override // yd3.f.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public ProcessId getProcessId() {
                return this.processId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.processId, initialized.processId) && this.author == initialized.author && t.c(this.description, initialized.description) && t.c(this.confirmationModel, initialized.confirmationModel);
            }

            @Override // yd3.f.a
            public BEVehicleCollisionDescriptionConception getDescription() {
                return this.description;
            }

            public int hashCode() {
                return (((((this.processId.hashCode() * 31) + this.author.hashCode()) * 31) + this.description.hashCode()) * 31) + this.confirmationModel.hashCode();
            }

            public String toString() {
                return "Initialized(processId=" + this.processId + ", author=" + this.author + ", description=" + this.description + ", confirmationModel=" + this.confirmationModel + ')';
            }
        }

        /* JADX INFO: renamed from: C */
        o getAuthor();

        /* JADX INFO: renamed from: e */
        ProcessId getProcessId();

        BEVehicleCollisionDescriptionConception getDescription();
    }

    /* JADX INFO: renamed from: yd3.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyd3/f$b;", "Lyd3/f;", "Ltv0/g;", "savedDraftCollision", "<init>", "(Ltv0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/g;", "()Ltv0/g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitialInfoConfirmed implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BESavedDraftCollision savedDraftCollision;

        public InitialInfoConfirmed(BESavedDraftCollision bESavedDraftCollision) {
            this.savedDraftCollision = bESavedDraftCollision;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BESavedDraftCollision getSavedDraftCollision() {
            return this.savedDraftCollision;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitialInfoConfirmed) && t.c(this.savedDraftCollision, ((InitialInfoConfirmed) other).savedDraftCollision);
        }

        public int hashCode() {
            return this.savedDraftCollision.hashCode();
        }

        public String toString() {
            return "InitialInfoConfirmed(savedDraftCollision=" + this.savedDraftCollision + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.f$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyd3/f$c;", "Lyd3/f;", "Ltv0/g;", "savedDraftCollision", "Lsv0/c0;", "statementDetailsData", "<init>", "(Ltv0/g;Lsv0/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/g;", "()Ltv0/g;", "b", "Lsv0/c0;", "()Lsv0/c0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadyToSign implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BESavedDraftCollision savedDraftCollision;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c0 statementDetailsData;

        public ReadyToSign(BESavedDraftCollision bESavedDraftCollision, c0 c0Var) {
            this.savedDraftCollision = bESavedDraftCollision;
            this.statementDetailsData = c0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BESavedDraftCollision getSavedDraftCollision() {
            return this.savedDraftCollision;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c0 getStatementDetailsData() {
            return this.statementDetailsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadyToSign)) {
                return false;
            }
            ReadyToSign readyToSign = (ReadyToSign) other;
            return t.c(this.savedDraftCollision, readyToSign.savedDraftCollision) && t.c(this.statementDetailsData, readyToSign.statementDetailsData);
        }

        public int hashCode() {
            return (this.savedDraftCollision.hashCode() * 31) + this.statementDetailsData.hashCode();
        }

        public String toString() {
            return "ReadyToSign(savedDraftCollision=" + this.savedDraftCollision + ", statementDetailsData=" + this.statementDetailsData + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.f$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyd3/f$d;", "Lyd3/f;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadyToSignConfirmed implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public ReadyToSignConfirmed(ProcessId processId) {
            this.processId = processId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReadyToSignConfirmed) && t.c(this.processId, ((ReadyToSignConfirmed) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "ReadyToSignConfirmed(processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.f$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyd3/f$e;", "Lyd3/f;", "Ltv0/g;", "savedDraftCollision", "<init>", "(Ltv0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/g;", "()Ltv0/g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadyToSignConfirmedByMe implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BESavedDraftCollision savedDraftCollision;

        public ReadyToSignConfirmedByMe(BESavedDraftCollision bESavedDraftCollision) {
            this.savedDraftCollision = bESavedDraftCollision;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BESavedDraftCollision getSavedDraftCollision() {
            return this.savedDraftCollision;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReadyToSignConfirmedByMe) && t.c(this.savedDraftCollision, ((ReadyToSignConfirmedByMe) other).savedDraftCollision);
        }

        public int hashCode() {
            return this.savedDraftCollision.hashCode();
        }

        public String toString() {
            return "ReadyToSignConfirmedByMe(savedDraftCollision=" + this.savedDraftCollision + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.f$f, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyd3/f$f;", "Lyd3/f;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadyToSignRejectedByOther implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public ReadyToSignRejectedByOther(ProcessId processId) {
            this.processId = processId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReadyToSignRejectedByOther) && t.c(this.processId, ((ReadyToSignRejectedByOther) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "ReadyToSignRejectedByOther(processId=" + this.processId + ')';
        }
    }

    /* JADX INFO: renamed from: yd3.f$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyd3/f$g;", "Lyd3/f;", "Ltv0/g;", "savedDraftCollision", "<init>", "(Ltv0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/g;", "()Ltv0/g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementFilledByMe implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BESavedDraftCollision savedDraftCollision;

        public StatementFilledByMe(BESavedDraftCollision bESavedDraftCollision) {
            this.savedDraftCollision = bESavedDraftCollision;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BESavedDraftCollision getSavedDraftCollision() {
            return this.savedDraftCollision;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatementFilledByMe) && t.c(this.savedDraftCollision, ((StatementFilledByMe) other).savedDraftCollision);
        }

        public int hashCode() {
            return this.savedDraftCollision.hashCode();
        }

        public String toString() {
            return "StatementFilledByMe(savedDraftCollision=" + this.savedDraftCollision + ')';
        }
    }
}
