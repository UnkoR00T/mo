package xl0;

import al0.AdditionalAttachmentsData;
import al0.BEFileInfo;
import al0.Child;
import al0.Ward;
import al0.x0;
import fr.t;
import gm0.AddressDataDto;
import gm0.ContactDetailsDto;
import gm0.GeneratePhysicalIdCardXmlApplicationChildV4Request;
import gm0.PersonalChildDataDto;
import gm0.m1;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxl0/n;", "Lxw/f;", "Lxl0/n$a;", "Lgm0/h2;", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "<init>", "(Lxl0/l;)V", "Lal0/x0;", "Lal0/g;", "e", "(Lal0/x0;)Lal0/g;", "params", "c", "(Lxl0/n$a;)Lgm0/h2;", "a", "Lxl0/l;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements xw.f<Params, GeneratePhysicalIdCardXmlApplicationChildV4Request> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l pickedFileToFileV4DtoMapper;

    /* JADX INFO: renamed from: xl0.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxl0/n$a;", "", "Lal0/x0;", "data", "<init>", "(Lal0/x0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/x0;", "()Lal0/x0;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final x0 data;

        public Params(x0 x0Var) {
            this.data = x0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x0 getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public n(l lVar) {
        this.pickedFileToFileV4DtoMapper = lVar;
    }

    private final al0.g e(x0 x0Var) {
        if (x0Var instanceof Child) {
            return new al0.g.Child(((Child) x0Var).getChildData().getAge());
        }
        if (x0Var instanceof Ward) {
            return new al0.g.Ward(((Ward) x0Var).getChildData().getAge());
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public GeneratePhysicalIdCardXmlApplicationChildV4Request b(Params params) {
        n nVar = this;
        x0 data = params.getData();
        AddressDataDto addressDataDtoI = f.i(data.getCorrespondenceAddressData());
        gm0.c cVarA = f.a(nVar.e(data));
        gm0.i iVarJ = f.j(data.getReasonForApplying());
        m1 m1VarA = m.a(data);
        PersonalChildDataDto personalChildDataDtoB = m.b(data);
        String id5 = data.getCommunityOffice().getId();
        Boolean hasPersonalSigningCertificate = data.getHasPersonalSigningCertificate();
        boolean zBooleanValue = hasPersonalSigningCertificate != null ? hasPersonalSigningCertificate.booleanValue() : false;
        String strE = c0.e(data.getParentOrGuardData().getIdentityCardSeriesAndNumber());
        ContactDetailsDto contactDetailsDtoK = f.k(data.getBeContactDetailsData());
        wx.i.Image file = data.getAddPhotoData().getFile();
        Ward ward = data instanceof Ward ? (Ward) data : null;
        wx.i guardianCertificate = ward != null ? ward.getGuardianCertificate() : null;
        AdditionalAttachmentsData additionalAttachmentsData = data.getAdditionalAttachmentsData();
        wx.i coveringFaceFile = additionalAttachmentsData != null ? additionalAttachmentsData.getCoveringFaceFile() : null;
        if (!data.getAddPhotoData().getIsAnyAdditionalPhotoSelected()) {
            coveringFaceFile = null;
        }
        AdditionalAttachmentsData additionalAttachmentsData2 = data.getAdditionalAttachmentsData();
        List<wx.i> listS = v.s(file, guardianCertificate, coveringFaceFile, data.getAddPhotoData().getIsAnyAdditionalPhotoSelected() ? additionalAttachmentsData2 != null ? additionalAttachmentsData2.getGlassesFile() : null : null);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        for (wx.i iVar : listS) {
            arrayList.add(nVar.pickedFileToFileV4DtoMapper.b(new l.Params(iVar, t.c(iVar, data.getAddPhotoData().getFile()) ? BEFileInfo.a.Photo : BEFileInfo.a.Attachment)));
            nVar = this;
        }
        return new GeneratePhysicalIdCardXmlApplicationChildV4Request(addressDataDtoI, cVarA, iVarJ, m1VarA, personalChildDataDtoB, id5, arrayList, zBooleanValue, strE, contactDetailsDtoK, null, 1024, null);
    }
}
