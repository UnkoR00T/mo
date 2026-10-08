package s22;

import fr.t;
import g30.v;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import r22.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%#B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u00020\u0016*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\f*\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ls22/q;", "Lxw/f;", "Ls22/q$b;", "Ln40/c;", "Lmx/c;", "labelProvider", "Ldz/b;", "fileSizeFormatter", "<init>", "(Lmx/c;Ldz/b;)V", "params", "", "Ln40/i;", "r", "(Ls22/q$b;)Ljava/util/List;", "Lm02/c$b;", "", "index", "Lkotlin/Function1;", "Lm02/c;", "Loq/i0;", "onDeleteFile", "Ln40/i$b;", "s", "(Lm02/c$b;ILer/l;)Ln40/i$b;", "Lm02/c$a;", "u", "(Lm02/c$a;ILer/l;)Ln40/i;", "", "sizeInBytes", "Lmx/a;", "l", "(F)Lmx/a;", "m", "(Ls22/q$b;)Ln40/c;", "a", "Lmx/c;", "b", "Ldz/b;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, FilePickerData> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f177687d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f177688e = xw.a.b(5.0E7f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f177689f = xw.a.b(5.0E8f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.b fileSizeFormatter;

    /* JADX INFO: renamed from: s22.q$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls22/q$b;", "", "Lr22/c$a;", "", "Lm02/c;", "filesData", "Lkotlin/Function1;", "Loq/i0;", "onDeleteFileClick", "Lg30/v;", "onBottomSheetStateChanged", "<init>", "(Lr22/c$a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr22/c$a;", "()Lr22/c$a;", "b", "Ler/l;", "c", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State.Field<List<m02.c>> filesData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<m02.c, i0> onDeleteFileClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v, i0> onBottomSheetStateChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State.Field<List<m02.c>> field, er.l<? super m02.c, i0> lVar, er.l<? super v, i0> lVar2) {
            this.filesData = field;
            this.onDeleteFileClick = lVar;
            this.onBottomSheetStateChanged = lVar2;
        }

        public final State.Field<List<m02.c>> a() {
            return this.filesData;
        }

        public final er.l<v, i0> b() {
            return this.onBottomSheetStateChanged;
        }

        public final er.l<m02.c, i0> c() {
            return this.onDeleteFileClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.filesData, params.filesData) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged);
        }

        public int hashCode() {
            return (((this.filesData.hashCode() * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode();
        }

        public String toString() {
            return "Params(filesData=" + this.filesData + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ')';
        }
    }

    public q(mx.c cVar, dz.b bVar) {
        this.labelProvider = cVar;
        this.fileSizeFormatter = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(er.l lVar, m02.c.PickedFileData pickedFileData) {
        lVar.b(pickedFileData);
        return i0.f148189a;
    }

    private final Label l(float sizeInBytes) {
        return this.fileSizeFormatter.a(sizeInBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.b().b(v.EXPANDED);
        return i0.f148189a;
    }

    private final List<n40.i> r(Params params) {
        n40.i iVarS;
        List<m02.c> listD = params.a().d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            m02.c cVar = (m02.c) obj;
            if (cVar instanceof m02.c.PickedFileData) {
                iVarS = u((m02.c.PickedFileData) cVar, i15, params.c());
            } else {
                if (!(cVar instanceof m02.c.UploadedFilePlaceholder)) {
                    throw new oq.p();
                }
                iVarS = s((m02.c.UploadedFilePlaceholder) cVar, i15, params.c());
            }
            arrayList.add(iVarS);
            i15 = i16;
        }
        return arrayList;
    }

    private final n40.i.Regular s(final m02.c.UploadedFilePlaceholder uploadedFilePlaceholder, int i15, final er.l<? super m02.c, i0> lVar) {
        return new n40.i.Regular(mx.b.b(uploadedFilePlaceholder.getFullName(), "fileTitle_" + i15), l(uploadedFilePlaceholder.getFileSizeInBytes()), null, new er.a() { // from class: s22.l
            @Override // er.a
            public final Object a() {
                return q.v(lVar, uploadedFilePlaceholder);
            }
        }, 4, null);
    }

    private final n40.i u(final m02.c.PickedFileData pickedFileData, int i15, final er.l<? super m02.c, i0> lVar) {
        zz.a pickedFile = pickedFileData.getPickedFile();
        if (pickedFile instanceof zz.a.Image) {
            return new n40.i.Image(mx.b.b(((zz.a.Image) pickedFileData.getPickedFile()).getMetadata().getName(), "fileTitle" + i15), l(((zz.a.Image) pickedFileData.getPickedFile()).getMetadata().getSizeInBytes()), new er.a() { // from class: s22.m
                @Override // er.a
                public final Object a() {
                    return q.x(lVar, pickedFileData);
                }
            }, new er.a() { // from class: s22.n
                @Override // er.a
                public final Object a() {
                    return q.z();
                }
            }, new n40.i.Image.AbstractC3255a.Image(((zz.a.Image) pickedFileData.getPickedFile()).getThumbnail()));
        }
        if (!(pickedFile instanceof zz.a.Regular)) {
            throw new oq.p();
        }
        return new n40.i.Regular(mx.b.b(((zz.a.Regular) pickedFileData.getPickedFile()).getMetadata().getName() + '.' + ((zz.a.Regular) pickedFileData.getPickedFile()).getMetadata().getExtension(), "fileTitle_" + i15), l(((zz.a.Regular) pickedFileData.getPickedFile()).getMetadata().getSizeInBytes()), null, new er.a() { // from class: s22.o
            @Override // er.a
            public final Object a() {
                return q.E(lVar, pickedFileData);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(er.l lVar, m02.c.UploadedFilePlaceholder uploadedFilePlaceholder) {
        lVar.b(uploadedFilePlaceholder);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(er.l lVar, m02.c.PickedFileData pickedFileData) {
        lVar.b(pickedFileData);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public FilePickerData b(final Params params) {
        Label labelC = this.labelProvider.c(e02.a.D);
        hz.b state = params.a().getState();
        hz.b.Invalid invalid = state instanceof hz.b.Invalid ? (hz.b.Invalid) state : null;
        return new FilePickerData(labelC, invalid != null ? invalid.getMessage() : null, r(params), pq.v.q(new n40.e.b.File(f177688e, null), new n40.e.b.Total(f177689f, null)), new er.a() { // from class: s22.p
            @Override // er.a
            public final Object a() {
                return q.q(params);
            }
        }, Integer.MAX_VALUE);
    }
}
