package com.project.inventaris.mapper;

import com.project.inventaris.dto.LaporanDto;
import com.project.inventaris.entity.Laporan;


public class LaporanMapper {
    public static Laporan mapToLaporan(LaporanDto laporanDto){
        return Laporan.builder()
                .kelas(laporanDto.getKelas())
                .ac(laporanDto.getAc())
                .jamDinding(laporanDto.getJamDinding())
                .kursi(laporanDto.getKursi())
                .lainnya(laporanDto.getLainnya())
                .papan(laporanDto.getPapan())
                .penghapus(laporanDto.getPenghapus())
                .proyektor(laporanDto.getProyektor())
                .spidol(laporanDto.getSpidol())
                .build();
    }
    public static LaporanDto mapToLaporanDto(Laporan laporan){
        return LaporanDto.builder()
                .kelas(laporan.getKelas())
                .ac(laporan.getAc())
                .jamDinding(laporan.getJamDinding())
                .kursi(laporan.getKursi())
                .lainnya(laporan.getLainnya())
                .papan(laporan.getPapan())
                .penghapus(laporan.getPenghapus())
                .proyektor(laporan.getProyektor())
                .spidol(laporan.getSpidol()).build();
    }
}
