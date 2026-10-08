package vn1;

import al0.IdCardSuspensionChildData;
import al0.ParentOrGuardData;
import iy.b0;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;
import ru3.ContactDetailsData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006("}, d2 = {"Lvn1/d;", "", "Lvn1/h;", "yourDataMapper", "Lvn1/e;", "dependentDataMapper", "Lvn1/f;", "officeDataMapper", "Lvn1/a;", "certReceiveMethodMapper", "Lvn1/c;", "contactDetailsDataMapper", "<init>", "(Lvn1/h;Lvn1/e;Lvn1/f;Lvn1/a;Lvn1/c;)V", "Lal0/j0;", "data", "Ltn1/c$a$a;", "e", "(Lal0/j0;)Ltn1/c$a$a;", "Lmm1/a;", "type", "Lal0/d0;", "c", "(Lmm1/a;Lal0/d0;)Ltn1/c$a$a;", "Lpy3/b$b;", "d", "(Lpy3/b$b;)Ltn1/c$a$a;", "Leu3/a;", "a", "(Leu3/a;)Ltn1/c$a$a;", "Lru3/b;", "Liy/b0;", "userEdorAddress", "b", "(Lru3/b;Liy/b0;)Ltn1/c$a$a;", "Lvn1/h;", "Lvn1/e;", "Lvn1/f;", "Lvn1/a;", "Lvn1/c;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h yourDataMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dependentDataMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f officeDataMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a certReceiveMethodMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c contactDetailsDataMapper;

    public d(h hVar, e eVar, f fVar, a aVar, c cVar) {
        this.yourDataMapper = hVar;
        this.dependentDataMapper = eVar;
        this.officeDataMapper = fVar;
        this.certReceiveMethodMapper = aVar;
        this.contactDetailsDataMapper = cVar;
    }

    public final tn1.c.Data.Section a(eu3.a data) {
        return this.certReceiveMethodMapper.b(new a.Params(data));
    }

    public final tn1.c.Data.Section b(ContactDetailsData data, b0 userEdorAddress) {
        return this.contactDetailsDataMapper.b(new c.Params(data, userEdorAddress));
    }

    public final tn1.c.Data.Section c(mm1.a type, IdCardSuspensionChildData data) {
        return this.dependentDataMapper.b(new e.Params(type, data));
    }

    public final tn1.c.Data.Section d(OfficeSelectionData.Office data) {
        return this.officeDataMapper.b(new f.Params(data));
    }

    public final tn1.c.Data.Section e(ParentOrGuardData data) {
        return this.yourDataMapper.b(new h.Params(data));
    }
}
