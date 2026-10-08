package e3;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u0006*"}, d2 = {"Le3/b;", "", "<init>", "()V", "", "groupKey", "Lo2/d;", "groupSourceInformation", "child", "Loq/i0;", "b", "(ILo2/d;Ljava/lang/Object;)V", "targetChild", "Le3/d;", "c", "(ILo2/d;Ljava/lang/Object;)Le3/d;", "group", "g", "(Ljava/lang/Object;)Lo2/d;", "", "e", "(Lo2/d;)Z", "sourceInformation", "target", "a", "(ILo2/d;Ljava/lang/Object;)Z", "", "i", "()Ljava/util/List;", "objectKey", "childData", "f", "(ILjava/lang/Object;Lo2/d;Ljava/lang/Object;)V", "Lm2/b;", "anchor", "h", "(Lm2/b;)Lo2/d;", "d", "(Lm2/b;)I", "", "Ljava/util/List;", "_trace", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    private final boolean a(int groupKey, o2.d sourceInformation, Object target) {
        ArrayList<Object> arrayListB = sourceInformation.b();
        boolean z15 = false;
        if (arrayListB == null) {
            if (!sourceInformation.getClosed()) {
                b(groupKey, sourceInformation, null);
                return true;
            }
            int dataStartOffset = sourceInformation.getDataStartOffset();
            int dataEndOffset = sourceInformation.getDataEndOffset();
            if (target instanceof Integer) {
                Number number = (Number) target;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z15 = true;
                }
                if (z15) {
                    b(sourceInformation.getKey(), sourceInformation, null);
                }
            }
            return z15;
        }
        int size = arrayListB.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = arrayListB.get(i15);
            if (obj instanceof p076m2.b) {
                if (fr.t.c(obj, target)) {
                    b(sourceInformation.getKey(), sourceInformation, obj);
                    return true;
                }
            } else {
                if (!(obj instanceof o2.d)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj).toString());
                }
                if (a(groupKey, (o2.d) obj, target)) {
                    b(sourceInformation.getKey(), sourceInformation, obj);
                    return true;
                }
            }
        }
        return false;
    }

    private final void b(int groupKey, o2.d groupSourceInformation, Object child) {
        ComposeStackTraceFrame composeStackTraceFrameC = c(groupKey, groupSourceInformation, child);
        if (composeStackTraceFrameC != null) {
            this._trace.add(composeStackTraceFrameC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    private final ComposeStackTraceFrame c(int groupKey, o2.d groupSourceInformation, Object targetChild) {
        ArrayList<Object> arrayListB;
        String sourceInformation;
        a0 a0VarE = (groupSourceInformation == null || (sourceInformation = groupSourceInformation.getSourceInformation()) == null) ? null : b0.e(sourceInformation);
        if (a0VarE == null) {
            return new ComposeStackTraceFrame(groupKey, null, null);
        }
        if (targetChild == null) {
            return new ComposeStackTraceFrame(groupKey, a0VarE, null);
        }
        ArrayList<Object> arrayListB2 = groupSourceInformation.b();
        int i15 = 0;
        if (arrayListB2 != null) {
            int size = arrayListB2.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                Object obj = arrayListB2.get(i17);
                if (fr.t.c(obj, targetChild)) {
                    break;
                }
                o2.d dVarG = g(obj);
                if (dVarG != null && (dVarG.getKey() == -127 || (dVarG.getKey() == 0 && (obj instanceof p076m2.b) && d((p076m2.b) obj) == -127))) {
                    if ((dVarG != null ? dVarG.getSourceInformation() : null) == null) {
                        if (dVarG != null && (arrayListB = dVarG.b()) != null) {
                            int size2 = arrayListB.size();
                            for (int i18 = 0; i18 < size2; i18++) {
                                o2.d dVarG2 = g(arrayListB.get(i18));
                                if (dVarG2 != null && e(dVarG2)) {
                                    i16++;
                                }
                            }
                        }
                    } else if (dVarG == null) {
                    }
                } else if (dVarG == null && e(dVarG)) {
                    i16++;
                }
            }
            i15 = i16;
        }
        return new ComposeStackTraceFrame(groupKey, a0VarE, Integer.valueOf(i15));
    }

    private final boolean e(o2.d dVar) {
        String sourceInformation = dVar.getSourceInformation();
        return sourceInformation != null && fu.r.V(sourceInformation, "C", false, 2, null);
    }

    private final o2.d g(Object group) {
        if (group instanceof p076m2.b) {
            return h((p076m2.b) group);
        }
        if (group instanceof o2.d) {
            return (o2.d) group;
        }
        throw new IllegalStateException(("Unexpected child source info " + group).toString());
    }

    public abstract int d(p076m2.b anchor);

    public final void f(int groupKey, Object objectKey, o2.d sourceInformation, Object childData) {
        if (sourceInformation != null || fr.t.c(objectKey, p076m2.r.INSTANCE.a())) {
            if (childData == null || sourceInformation == null) {
                b(groupKey, sourceInformation, null);
            } else {
                if (a(groupKey, sourceInformation, childData) || sourceInformation.getClosed()) {
                    return;
                }
                b(groupKey, sourceInformation, childData);
            }
        }
    }

    public abstract o2.d h(p076m2.b anchor);

    public final List<ComposeStackTraceFrame> i() {
        return this._trace;
    }
}
