package rf3;

import fr.k;
import fr.t;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import tv0.BEVehicleCollisionDescriptionConception;

/* JADX INFO: renamed from: rf3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lrf3/a;", "", "Lrf3/a$a$a;", "crashDateField", "Lrf3/a$a$c;", "crashLocationField", "Lrf3/a$a$b;", "crashDescriptionField", "<init>", "(Lrf3/a$a$a;Lrf3/a$a$c;Lrf3/a$a$b;)V", "", "Lrf3/a$a;", "c", "()Ljava/util/List;", "", "h", "()Z", "Lrf3/a$b;", "g", "()Lrf3/a$b;", "a", "(Lrf3/a$a$a;Lrf3/a$a$c;Lrf3/a$a$b;)Lrf3/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrf3/a$a$a;", "d", "()Lrf3/a$a$a;", "b", "Lrf3/a$a$c;", "f", "()Lrf3/a$a$c;", "Lrf3/a$a$b;", "e", "()Lrf3/a$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDataFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC4433a.DateTime crashDateField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC4433a.Location crashLocationField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC4433a.Input crashDescriptionField;

    /* JADX INFO: renamed from: rf3.a$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lrf3/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        CRASH_DATE,
        CRASH_LOCATION,
        CRASH_DESCRIPTION;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f173706e = wq.b.a(b());
    }

    public CollisionDataFields(InterfaceC4433a.DateTime dateTime, InterfaceC4433a.Location location, InterfaceC4433a.Input input) {
        this.crashDateField = dateTime;
        this.crashLocationField = location;
        this.crashDescriptionField = input;
    }

    public static /* synthetic */ CollisionDataFields b(CollisionDataFields collisionDataFields, InterfaceC4433a.DateTime dateTime, InterfaceC4433a.Location location, InterfaceC4433a.Input input, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dateTime = collisionDataFields.crashDateField;
        }
        if ((i15 & 2) != 0) {
            location = collisionDataFields.crashLocationField;
        }
        if ((i15 & 4) != 0) {
            input = collisionDataFields.crashDescriptionField;
        }
        return collisionDataFields.a(dateTime, location, input);
    }

    private final List<InterfaceC4433a> c() {
        return v.q(this.crashDateField, this.crashLocationField, this.crashDescriptionField);
    }

    public final CollisionDataFields a(InterfaceC4433a.DateTime crashDateField, InterfaceC4433a.Location crashLocationField, InterfaceC4433a.Input crashDescriptionField) {
        return new CollisionDataFields(crashDateField, crashLocationField, crashDescriptionField);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC4433a.DateTime getCrashDateField() {
        return this.crashDateField;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC4433a.Input getCrashDescriptionField() {
        return this.crashDescriptionField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDataFields)) {
            return false;
        }
        CollisionDataFields collisionDataFields = (CollisionDataFields) other;
        return t.c(this.crashDateField, collisionDataFields.crashDateField) && t.c(this.crashLocationField, collisionDataFields.crashLocationField) && t.c(this.crashDescriptionField, collisionDataFields.crashDescriptionField);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC4433a.Location getCrashLocationField() {
        return this.crashLocationField;
    }

    public final b g() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC4433a) next).getValidationState().a());
        InterfaceC4433a interfaceC4433a = (InterfaceC4433a) next;
        if (interfaceC4433a != null) {
            return interfaceC4433a.getField();
        }
        return null;
    }

    public final boolean h() {
        List<InterfaceC4433a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC4433a) it.next()).getValidationState().a()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.crashDateField.hashCode() * 31) + this.crashLocationField.hashCode()) * 31) + this.crashDescriptionField.hashCode();
    }

    public String toString() {
        return "CollisionDataFields(crashDateField=" + this.crashDateField + ", crashLocationField=" + this.crashLocationField + ", crashDescriptionField=" + this.crashDescriptionField + ')';
    }

    /* JADX INFO: renamed from: rf3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\n\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lrf3/a$a;", "", "Lrf3/a$b;", "a", "()Lrf3/a$b;", "field", "Lhz/b;", "b", "()Lhz/b;", "validationState", "c", "Lrf3/a$a$a;", "Lrf3/a$a$b;", "Lrf3/a$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC4433a {
        /* JADX INFO: renamed from: a */
        b getField();

        /* JADX INFO: renamed from: b */
        hz.b getValidationState();

        /* JADX INFO: renamed from: rf3.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrf3/a$a$a;", "Lrf3/a$a;", "Lrf3/a$b;", "field", "Lhz/b;", "validationState", "Lfz/b$d;", "dateType", "<init>", "(Lrf3/a$b;Lhz/b;Lfz/b$d;)V", "c", "(Lrf3/a$b;Lhz/b;Lfz/b$d;)Lrf3/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrf3/a$b;", "()Lrf3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "Lfz/b$d;", "e", "()Lfz/b$d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DateTime implements InterfaceC4433a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f173691d = fz.b.LocalDateTime.f68862b | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final fz.b.LocalDateTime dateType;

            public DateTime(b bVar, hz.b bVar2, fz.b.LocalDateTime localDateTime) {
                this.field = bVar;
                this.validationState = bVar2;
                this.dateType = localDateTime;
            }

            public static /* synthetic */ DateTime d(DateTime dateTime, b bVar, hz.b bVar2, fz.b.LocalDateTime localDateTime, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = dateTime.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = dateTime.validationState;
                }
                if ((i15 & 4) != 0) {
                    localDateTime = dateTime.dateType;
                }
                return dateTime.c(bVar, bVar2, localDateTime);
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final DateTime c(b field, hz.b validationState, fz.b.LocalDateTime dateType) {
                return new DateTime(field, validationState, dateType);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final fz.b.LocalDateTime getDateType() {
                return this.dateType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DateTime)) {
                    return false;
                }
                DateTime dateTime = (DateTime) other;
                return this.field == dateTime.field && t.c(this.validationState, dateTime.validationState) && t.c(this.dateType, dateTime.dateType);
            }

            public int hashCode() {
                return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.dateType.hashCode();
            }

            public String toString() {
                return "DateTime(field=" + this.field + ", validationState=" + this.validationState + ", dateType=" + this.dateType + ')';
            }

            public /* synthetic */ DateTime(b bVar, hz.b bVar2, fz.b.LocalDateTime localDateTime, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, localDateTime);
            }
        }

        /* JADX INFO: renamed from: rf3.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrf3/a$a$b;", "Lrf3/a$a;", "Lrf3/a$b;", "field", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lrf3/a$b;Lhz/b;Liy/b0;)V", "c", "(Lrf3/a$b;Lhz/b;Liy/b0;)Lrf3/a$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrf3/a$b;", "()Lrf3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "Liy/b0;", "e", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Input implements InterfaceC4433a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f173695d = b0.f97726c | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 value;

            public Input(b bVar, hz.b bVar2, b0 b0Var) {
                this.field = bVar;
                this.validationState = bVar2;
                this.value = b0Var;
            }

            public static /* synthetic */ Input d(Input input, b bVar, hz.b bVar2, b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = input.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = input.validationState;
                }
                if ((i15 & 4) != 0) {
                    b0Var = input.value;
                }
                return input.c(bVar, bVar2, b0Var);
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final Input c(b field, hz.b validationState, b0 value) {
                return new Input(field, validationState, value);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b0 getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return this.field == input.field && t.c(this.validationState, input.validationState) && t.c(this.value, input.value);
            }

            public int hashCode() {
                return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Input(field=" + this.field + ", validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public /* synthetic */ Input(b bVar, hz.b bVar2, b0 b0Var, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, b0Var);
            }
        }

        /* JADX INFO: renamed from: rf3.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrf3/a$a$c;", "Lrf3/a$a;", "Lrf3/a$b;", "field", "Lhz/b;", "validationState", "Ltv0/i$a;", "location", "<init>", "(Lrf3/a$b;Lhz/b;Ltv0/i$a;)V", "c", "(Lrf3/a$b;Lhz/b;Ltv0/i$a;)Lrf3/a$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrf3/a$b;", "()Lrf3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "Ltv0/i$a;", "e", "()Ltv0/i$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Location implements InterfaceC4433a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEVehicleCollisionDescriptionConception.LocationDetails location;

            public Location(b bVar, hz.b bVar2, BEVehicleCollisionDescriptionConception.LocationDetails locationDetails) {
                this.field = bVar;
                this.validationState = bVar2;
                this.location = locationDetails;
            }

            public static /* synthetic */ Location d(Location location, b bVar, hz.b bVar2, BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = location.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = location.validationState;
                }
                if ((i15 & 4) != 0) {
                    locationDetails = location.location;
                }
                return location.c(bVar, bVar2, locationDetails);
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // rf3.CollisionDataFields.InterfaceC4433a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final Location c(b field, hz.b validationState, BEVehicleCollisionDescriptionConception.LocationDetails location) {
                return new Location(field, validationState, location);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BEVehicleCollisionDescriptionConception.LocationDetails getLocation() {
                return this.location;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Location)) {
                    return false;
                }
                Location location = (Location) other;
                return this.field == location.field && t.c(this.validationState, location.validationState) && t.c(this.location, location.location);
            }

            public int hashCode() {
                int iHashCode = ((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31;
                BEVehicleCollisionDescriptionConception.LocationDetails locationDetails = this.location;
                return iHashCode + (locationDetails == null ? 0 : locationDetails.hashCode());
            }

            public String toString() {
                return "Location(field=" + this.field + ", validationState=" + this.validationState + ", location=" + this.location + ')';
            }

            public /* synthetic */ Location(b bVar, hz.b bVar2, BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, locationDetails);
            }
        }
    }
}
