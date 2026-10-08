package oa;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "Loq/i0;", "b", "(Ljava/util/Set;Ljava/util/Set;)V", "Loa/u;", "Loa/c;", "configuration", "a", "(Loa/u;Loa/c;)V", "c", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
final /* synthetic */ class w {
    public static final void a(u uVar, c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<mr.c<? extends ra.a>> setX = uVar.x();
        int size = cVar.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        Iterator<mr.c<? extends ra.a>> it = setX.iterator();
        while (true) {
            int i15 = -1;
            if (!it.hasNext()) {
                int size2 = cVar.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i16 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i16 < 0) {
                            break;
                        } else {
                            size2 = i16;
                        }
                    }
                }
                for (ra.b bVar : uVar.k(linkedHashMap)) {
                    if (!cVar.migrationContainer.c(bVar.startVersion, bVar.endVersion)) {
                        cVar.migrationContainer.a(bVar);
                    }
                }
                return;
            }
            mr.c<? extends ra.a> next = it.next();
            int size3 = cVar.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i17 = size3 - 1;
                    if (next.A(cVar.autoMigrationSpecs.get(size3))) {
                        zArr[size3] = true;
                        i15 = size3;
                        break;
                    } else if (i17 < 0) {
                        break;
                    } else {
                        size3 = i17;
                    }
                }
            }
            if (i15 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.C() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, cVar.autoMigrationSpecs.get(i15));
        }
    }

    public static final void b(Set<Integer> set, Set<Integer> set2) {
        if (set.isEmpty()) {
            return;
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (set2.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void c(u uVar, c cVar) {
        Map<mr.c<?>, List<mr.c<?>>> mapA = uVar.A();
        boolean[] zArr = new boolean[cVar.typeConverters.size()];
        for (Map.Entry<mr.c<?>, List<mr.c<?>>> entry : mapA.entrySet()) {
            mr.c<?> key = entry.getKey();
            for (mr.c<?> cVar2 : entry.getValue()) {
                int size = cVar.typeConverters.size() - 1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                while (true) {
                    int i15 = size - 1;
                    if (cVar2.A(cVar.typeConverters.get(size))) {
                        zArr[size] = true;
                        break;
                    } else {
                        if (i15 < 0) {
                            size = -1;
                            break;
                        }
                        size = i15;
                    }
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + cVar2.C() + ") for " + key.C() + " is missing in the database configuration.").toString());
                }
                uVar.f(cVar2, cVar.typeConverters.get(size));
            }
        }
        int size2 = cVar.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i16 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + cVar.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i16 < 0) {
                return;
            } else {
                size2 = i16;
            }
        }
    }
}
