package ja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(¨\u0006*"}, d2 = {"Lja/m;", "", "T", "<init>", "()V", "Lja/f0$a;", "event", "Loq/i0;", "e", "(Lja/f0$a;)V", "Lja/f0$b;", "c", "(Lja/f0$b;)V", "Lja/f0$c;", "d", "(Lja/f0$c;)V", "Lja/f0$d;", "f", "(Lja/f0$d;)V", "Lja/f0;", "a", "(Lja/f0;)V", "", "b", "()Ljava/util/List;", "", "I", "placeholdersBefore", "placeholdersAfter", "Lpq/m;", "Lja/m1;", "Lpq/m;", "pages", "Lja/e0;", "Lja/e0;", "sourceStates", "Lja/x;", "Lja/x;", "mediatorStates", "", "Z", "receivedFirstEvent", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pq.m<TransformablePage<T>> pages = new pq.m<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0 sourceStates = new e0();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private LoadStates mediatorStates;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean receivedFirstEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101042a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101042a = iArr;
        }
    }

    private final void c(f0.b<T> event) {
        this.sourceStates.b(event.getSourceLoadStates());
        this.mediatorStates = event.getMediatorLoadStates();
        int i15 = a.f101042a[event.getLoadType().ordinal()];
        if (i15 == 1) {
            this.placeholdersBefore = event.getPlaceholdersBefore();
            Iterator<Integer> it = lr.m.r(event.h().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.pages.addFirst(event.h().get(((pq.s0) it).nextInt()));
            }
            return;
        }
        if (i15 == 2) {
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.pages.addAll(event.h());
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            this.pages.clear();
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.placeholdersBefore = event.getPlaceholdersBefore();
            this.pages.addAll(event.h());
        }
    }

    private final void d(f0.c<T> event) {
        this.sourceStates.b(event.getSource());
        this.mediatorStates = event.getMediator();
    }

    private final void e(f0.a<T> event) {
        this.sourceStates.c(event.getLoadType(), w.NotLoading.INSTANCE.b());
        int i15 = a.f101042a[event.getLoadType().ordinal()];
        int i16 = 0;
        if (i15 == 1) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            int iF = event.f();
            while (i16 < iF) {
                this.pages.removeFirst();
                i16++;
            }
            return;
        }
        if (i15 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = event.getPlaceholdersRemaining();
        int iF2 = event.f();
        while (i16 < iF2) {
            this.pages.removeLast();
            i16++;
        }
    }

    private final void f(f0.d<T> event) {
        if (event.getSourceLoadStates() != null) {
            this.sourceStates.b(event.getSourceLoadStates());
        }
        if (event.getMediatorLoadStates() != null) {
            this.mediatorStates = event.getMediatorLoadStates();
        }
        this.pages.clear();
        this.placeholdersAfter = 0;
        this.placeholdersBefore = 0;
        this.pages.add(new TransformablePage<>(0, event.c()));
    }

    public final void a(f0<T> event) {
        this.receivedFirstEvent = true;
        if (event instanceof f0.b) {
            c((f0.b) event);
            return;
        }
        if (event instanceof f0.a) {
            e((f0.a) event);
        } else if (event instanceof f0.c) {
            d((f0.c) event);
        } else {
            if (!(event instanceof f0.d)) {
                throw new oq.p();
            }
            f((f0.d) event);
        }
    }

    public final List<f0<T>> b() {
        if (!this.receivedFirstEvent) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList();
        LoadStates loadStatesD = this.sourceStates.d();
        if (this.pages.isEmpty()) {
            arrayList.add(new f0.c(loadStatesD, this.mediatorStates));
            return arrayList;
        }
        arrayList.add(f0.b.INSTANCE.c(pq.v.f1(this.pages), this.placeholdersBefore, this.placeholdersAfter, loadStatesD, this.mediatorStates));
        return arrayList;
    }
}
